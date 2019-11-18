package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Musee;
import tacotroc.api.tacotroc.service.interfaces.IMuseeService;

@RestController
@CrossOrigin("*")
public class MuseeController {
	@Autowired
	IMuseeService iserv;

	@GetMapping(value="/musee")
	public List<Musee> allmusee(){
		return iserv.allMusee();
	}

	@GetMapping(value="/musee/{id}")
	public Musee allmusee(@PathVariable int id){
		return iserv.allMusee(id);
	}

	@GetMapping(value="/musee/add/{name}")
	public void addmusee(@PathVariable String name){
		iserv.addMusee(name);
	}

	@GetMapping(value="/musee/delete/{id}")
	public void deletemusee(@PathVariable int id){
		iserv.deleteMusee(id);
	}

	@PostMapping(value = "/musee/update")
	public void updatemusee(@RequestBody Musee musee){
		iserv.updateMusee(musee);
	}

}
