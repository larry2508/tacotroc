package tacotroc.api.tacotroc.service.classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Model;
import tacotroc.api.tacotroc.dao.IModelDao;
import tacotroc.api.tacotroc.service.interfaces.IModelService;
@Service
public class ModelService implements IModelService {
	@Autowired
	IModelDao idao;
	@Override
	public List<Model> allModel() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public void deleteModel(int id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
	}

	@Override
	public void addModel(Model model) {
		// TODO Auto-generated method stub
		idao.save(model);
	}

	@Override
	public Model allModel(int id) {
		// TODO Auto-generated method stub
		Integer ids=id;
		return idao.findById(ids).get();
	}

}
