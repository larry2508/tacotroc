package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Marque;
import tacotroc.api.tacotroc.dao.IBrandDao;
import tacotroc.api.tacotroc.service.interfaces.IBrandService;
@Service
public class BrandService implements IBrandService {
	@Autowired
	IBrandDao idao;
	@Override
	public List<Marque> allMarque() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void addMarque(String name) {
		// TODO Auto-generated method stub
		Marque c= new Marque();
		c.setName(name);
		idao.save(c);
	}

	@Override
	public void deleteMarque(int id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void updateMarque(Marque marque) {
		// TODO Auto-generated method stub
		idao.save(marque);
	}

	@Override
	public Marque allMarque(int id) {
		// TODO Auto-generated method stub
		Integer ids=id;
		return idao.findById(ids).get();
	}

}
