package tacotroc.api.tacotroc.service.classe;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tacotroc.api.tacotroc.beans.Car;
import tacotroc.api.tacotroc.dao.ICarDao;
import tacotroc.api.tacotroc.service.interfaces.ICarService;

public class CarService implements ICarService{

	@Autowired
	ICarDao idao;
	@Override
	public List<Car> allClub() {
		List<tacotroc.api.tacotroc.dto.Car> transit =idao.findAll();
		List<Car> renvoi= new ArrayList<Car>();
		
		for (tacotroc.api.tacotroc.dto.Car car : transit) {
			Car c = new Car(car);
			renvoi.add(c);
		}
		return renvoi;
	}
	@Override
	public void addCar(Car car) {
		tacotroc.api.tacotroc.dto.Car c = new tacotroc.api.tacotroc.dto.Car(car);
		idao.save(c);
		
	}
	@Override
	public void deleteCar(int id) {
		idao.deleteById(id);
		
	}
	@Override
	public void updateCar(tacotroc.api.tacotroc.dto.Car car) {
		// TODO Auto-generated method stub
		idao.save(car);
	}
	@Override
	public Car allCar(int id) {
		// TODO Auto-generated method stub
		Car c = new Car(idao.findById(id).get());
		return c;
	}



}
