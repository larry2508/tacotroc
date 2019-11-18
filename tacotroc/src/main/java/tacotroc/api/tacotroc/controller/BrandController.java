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
import tacotroc.api.tacotroc.service.interfaces.IBrandService;

@RestController
@CrossOrigin("*")
public class BrandController {
	@Autowired
	IBrandService iserv;

	@GetMapping(value="/marque")
	public List<Marque> allmarque(){
		return iserv.allMarque();
	}

	@GetMapping(value="/marque/{id}")
	public Marque allmarque(@PathVariable int id){
		return iserv.allMarque(id);
	}

	@GetMapping(value="/marque/add/{name}")
	public void addmarque(@PathVariable String name){
		iserv.addMarque(name);
	}

	@GetMapping(value="/marque/delete/{id}")
	public void deletemarque(@PathVariable int id){
		iserv.deleteMarque(id);
	}

	@PostMapping(value = "/marque/update")
	public void updatemarque(@RequestBody Marque musee){
		iserv.updateMarque(musee);
	}

}
