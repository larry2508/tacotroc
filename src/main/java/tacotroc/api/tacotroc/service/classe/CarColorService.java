package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.dao.ICarColorDao;
import tacotroc.api.tacotroc.dto.CarColor;
import tacotroc.api.tacotroc.service.interfaces.ICarColorService;
@Service
public class CarColorService implements ICarColorService {
	@PersistenceContext
	private EntityManager em;
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
	public void deleteColor(long id) {
	}

	@Override
	@Transactional
	@Modifying
	public void updateColor(CarColor color) {
		
		idao.save(color);
		
	}

	@Override
	public List<CarColor> allColor(long id) {
	return idao.findAllCCbyid(id);
	}

}
