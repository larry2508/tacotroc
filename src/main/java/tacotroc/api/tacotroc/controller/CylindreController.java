package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Color;
import tacotroc.api.tacotroc.beans.Cylindre;
import tacotroc.api.tacotroc.service.interfaces.ICylindreService;

@RestController
@CrossOrigin("*")
public class CylindreController {

	
	
	@Autowired
	ICylindreService iserv;
	
	@GetMapping(value="/cylindre")
	public List<Cylindre> allcylindre(){
	return iserv.allCylindre();
	}
	
	@GetMapping(value="/cylindre/{id}")
	public Cylindre allcylindre(@PathVariable long id){
	return iserv.allCylindre(id);
	}
	
	@GetMapping(value="/cylindre/add/{name}")
	public void addcylindre(@PathVariable String name){
		 iserv.addCylindre(name);
	}
	
	@GetMapping(value="/cylindre/delete/{id}")
	public void deletecylindre(@PathVariable long id){
		 iserv.deleteCylindre(id);
	}
	
	@PostMapping(value = "/cylindre/update")
	public void updateCylindre(@RequestBody Cylindre cylindre){
		iserv.updateCylindre(cylindre);
	}
	

}
