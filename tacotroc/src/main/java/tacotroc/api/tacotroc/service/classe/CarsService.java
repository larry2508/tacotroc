package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Cars;
import tacotroc.api.tacotroc.dao.ICarsDao;
import tacotroc.api.tacotroc.service.interfaces.ICarsService;
@Service
public class CarsService implements ICarsService {
	@Autowired
	ICarsDao idao;
	
	@Override
	public List<Cars> allCars() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void deleteCars(int id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void addCars(Cars cars) {
		// TODO Auto-generated method stub
		idao.save(cars);
	}

	@Override
	public Cars allCars(int id) {
		// TODO Auto-generated method stub
		Integer ids=id;
		return idao.findById(ids).get();
	}

}
