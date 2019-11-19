package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.dao.ICarColorDao;
import tacotroc.api.tacotroc.dto.CarColor;
import tacotroc.api.tacotroc.service.interfaces.ICarColorService;
@Service
public class CarColorService implements ICarColorService {
	@Autowired
	ICarColorDao idao;
	@Override
	public List<CarColor> allColor() {
		return idao.findAll();
	}

	@Override
	public void addColor(CarColor color) {
		idao.save(color);		
	}

	@Override
	public void deleteColor(int id) {
		deleteColor(id);
	}

	@Override
	public void updateColor(CarColor color) {
		idao.save(color);
		
	}

	@Override
	public List<CarColor> allColor(int id) {
	return idao.findAllCCbyid(id);
		//return null;
	}

}
