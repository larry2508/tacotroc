package tacotroc.api.tacotroc.service.classe;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Car;
import tacotroc.api.tacotroc.beans.Color;
import tacotroc.api.tacotroc.dao.ICarColorDao;
import tacotroc.api.tacotroc.dao.ICarDao;
import tacotroc.api.tacotroc.dao.IColorDao;
import tacotroc.api.tacotroc.dto.CarColor;
import tacotroc.api.tacotroc.service.interfaces.ICarColorService;
import tacotroc.api.tacotroc.service.interfaces.ICarService;

@Service
public class CarService implements ICarService{

@PersistenceContext
private EntityManager em;

	@Autowired
	ICarDao idao;
	@Autowired
	ICarColorDao idaoc;
	@Autowired
	IColorDao idaoco;
	@Autowired
	ICarColorService idaoc2;

	
	
	@Override
	public List<Car> allCar() {
		List<tacotroc.api.tacotroc.dto.Car> transit =idao.findAll();
		List<Car> renvoi= new ArrayList<Car>();
		for (tacotroc.api.tacotroc.dto.Car car : transit) {
			Car c = new Car(car);
			List<CarColor> impl=idaoc.findAllCCbyid(c.getId());
			c.setDetails_Color_1(impl.get(0).getColor());
			if(impl.size()>1) {
				c.setDetails_Color_2(impl.get(1).getColor());
			}
			renvoi.add(c);
		}
		return renvoi;
	}
	@Override
	public void addCar(Car car) {
		tacotroc.api.tacotroc.dto.Car c = new tacotroc.api.tacotroc.dto.Car(car);
		idao.save(c);
		int t=idao.findmaxId();
		long t2=car.getDetails_Color_1().getId();
		long t3=car.getDetails_Color_2().getId();
		List<CarColor>l=idaoc.findAll();
		CarColor col1=new CarColor();
		CarColor col2=new CarColor();
		col1.setId(t);
		col1.setColor(idaoco.findById(t2).get());
		col2.setId(t);
		col2.setColor(idaoco.findById(t3).get());;
		idaoc2.insertWithQuery(col1);
		idaoc2.insertWithQuery(col2);
	}
	@Override
	public void deleteCar(long id) {
		idaoc.deleteCCbyid(id);
		idao.deleteById(id);

	}
	@Override
	public void updateCar( Car car) {
		// TODO Auto-generated method stub
		List<CarColor> impl=idaoc.findAllCCbyid(car.getId());
		tacotroc.api.tacotroc.dto.Car c = new tacotroc.api.tacotroc.dto.Car(car);
		impl.get(0).setColor(car.getDetails_Color_1());
		impl.get(1).setColor(car.getDetails_Color_2());
		idaoc.save(impl.get(0));
		idaoc.save(impl.get(1));
		idao.save(c);
	}
	@Override
	public Car allCar(long id) {
		// TODO Auto-generated method stub
		Car c = new Car(idao.findById(id).get());
		List<CarColor> impl=idaoc.findAllCCbyid(c.getId());
		//c.setDetails_Color_1(impl.get(0).getColor());
		if(impl.size()>1) {
			c.setDetails_Color_2(impl.get(1).getColor());
		}
		return c;
	}



}
