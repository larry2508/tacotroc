package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Pays;
import tacotroc.api.tacotroc.service.interfaces.IPaysService;

@RestController
@CrossOrigin("*")
public class PaysController {
	
	@Autowired
	IPaysService iserv;
	
	@GetMapping(value="/pays")
	public List<Pays> allpays(){
	return iserv.allPays();
	}
	
	@GetMapping(value="/pays/{id}")
	public Pays allpays(@PathVariable long id){
	return iserv.allPays(id);
	}
	
	@GetMapping(value="/pays/add/{name}")
	public void addpays(@PathVariable String name){
		 iserv.addPays(name);
	}
	
	@GetMapping(value="/pays/delete/{id}")
	public void deletepays(@PathVariable long id){
		 iserv.deletePays(id);
	}
	
	@PostMapping(value = "/pays/update")
	public void updatePays(@RequestBody Pays pays){
		iserv.updatePays(pays);
	}
	
}
