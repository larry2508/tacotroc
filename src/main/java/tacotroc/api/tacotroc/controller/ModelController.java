package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Marque;
import tacotroc.api.tacotroc.beans.Model;
import tacotroc.api.tacotroc.service.interfaces.IModelService;

@RestController
@CrossOrigin("*")
public class ModelController {
	@Autowired
	IModelService iserv;

	@GetMapping(value="/model")
	public List<Model> allmodel(){
		return iserv.allModel();
	}
	
	@GetMapping(value="/marque")
	public List<Marque> allmarque(){
		return iserv.allMarque();
	}
	
	
	@GetMapping(value="/marque/add/{name}")
	public void addmusee(@PathVariable String name){
		iserv.addMarque(name);
	}


	@GetMapping(value="/model/{id}")
	public Model allmusee(@PathVariable long id){
		return iserv.allModel(id);
	}

	@PostMapping(value="/model/add")
	public void addmusee(@RequestBody Model name){
		iserv.addModel(name);
	}

	@GetMapping(value="/model/delete/{id}")
	public void deletemusee(@PathVariable long id){
		iserv.deleteModel(id);
	}

	@PostMapping(value = "/model/update")
	public void updatemusee(@RequestBody Model musee){
		iserv.updateModel(musee);
	}


}
