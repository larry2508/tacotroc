package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Model;
import tacotroc.api.tacotroc.service.interfaces.IModelService;

@RestController
@CrossOrigin("*")
public class ModelController {

	@Autowired
	IModelService iserv;

	@GetMapping(value="/model")
	public List<Model> allmodelS(){
		return iserv.allModel();
	}

	@GetMapping(value="/model/{id}")
	public Model allmodel(@PathVariable int id){
		return iserv.allModel(id);
	}

	@GetMapping(value="/model/delete/{id}")
	public void deletemodel(@PathVariable int id){
		iserv.deleteModel(id);
	}
	//avec id pour MAJ
	@PostMapping(value = "/model/update")
	public void updateAdresse(@RequestBody Model model){
		iserv.addModel(model);
	}
	//sans id pour ajout
	@PostMapping(value = "/model/add")
	public void addAdresse(@RequestBody Model model){
		iserv.addModel(model);
}
}