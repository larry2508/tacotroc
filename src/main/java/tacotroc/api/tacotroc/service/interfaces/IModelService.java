package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Marque;
import tacotroc.api.tacotroc.beans.Model;

@Service
public interface IModelService {
	List<Model> allModel();
	
	List<Marque> allMarque();

	void addModel(Model model);

	void deleteModel(long id);

	void updateModel(Model model);
	
	void addMarque(String marque);

	Model allModel(long id);
}
