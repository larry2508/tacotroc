package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Nationalite;
import tacotroc.api.tacotroc.service.interfaces.INationService;
@RestController
@CrossOrigin("*")
public class NationController {
	@Autowired
	INationService iserv;
	
	@GetMapping(value="/nation")
	public List<Nationalite> allnation(){
	return iserv.allNation();
	}
	
	@GetMapping(value="/nation/{id}")
	public Nationalite allnation(@PathVariable int id){
	return iserv.allNation(id);
	}
	
	@GetMapping(value="/nation/add/{name}")
	public void addnation(@PathVariable String name){
		 iserv.addNation(name);
	}
	
	@GetMapping(value="/nation/delete/{id}")
	public void deletenation(@PathVariable int id){
		 iserv.deleteNation(id);
	}
	
	@PostMapping(value = "/nation/update")
	public void updatenation(@RequestBody Nationalite nation){
		iserv.updateNation(nation);
	}
	
}
