package tacotroc.api.tacotroc.service.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import tacotroc.api.tacotroc.beans.Model;

@Service
public interface IModelService {
	List<Model> allModel();

	void deleteModel(int id);

	void addModel (Model model);

	Model allModel(int id);
}
