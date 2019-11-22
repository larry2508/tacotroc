package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Marque;
import tacotroc.api.tacotroc.beans.Model;
import tacotroc.api.tacotroc.beans.Musee;
import tacotroc.api.tacotroc.dao.IMarqueDao;
import tacotroc.api.tacotroc.dao.IModelDao;
import tacotroc.api.tacotroc.service.interfaces.IModelService;

@Service
public class ModelService implements IModelService {
	@Autowired
	IModelDao idao ;
	@Autowired
	IMarqueDao idao2;
	@Override
	public List<Model> allModel() {
		// TODO Auto-generated method stub
		return idao.findAll();	}
	
	@Override
	public void addModel(Model model) {
		// TODO Auto-generated method stub
		idao.save(model);
		
	}
	@Override
	public void deleteModel(long id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
		
	}
	@Override
	public void updateModel(Model model) {
		// TODO Auto-generated method stub
		idao.save(model);
		
	}
	@Override
	public void addMarque(String marque) {
		// TODO Auto-generated method stub
		Marque c= new Marque();
		c.setName(marque);
		idao2.save(c);
		
	}
	@Override
	public Model allModel(long id) {
		// TODO Auto-generated method stub
		return idao.findById(id).get();
	}

	@Override
	public List<Marque> allMarque() {
		// TODO Auto-generated method stub
		return idao2.findAll();
	}

}
