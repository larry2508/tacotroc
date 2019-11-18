package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Serie;
import tacotroc.api.tacotroc.service.interfaces.ISerieService;

@RestController
@CrossOrigin("*")
public class SerieController {

	@Autowired
	ISerieService iserv;
	
	@GetMapping(value="/serie")
	public List<Serie> allserie(){
	return iserv.allSerie();
	}
	@GetMapping(value="/serie/{id}")
	public Serie allserie(@PathVariable int id){
	return iserv.allSerie(id);
	}
	
	@GetMapping(value="/serie/add/{name}")
	public void addserie(@PathVariable String name){
		 iserv.addCSerie(name);
	}
	
	@GetMapping(value="/serie/delete/{id}")
	public void deleteserie(@PathVariable int id){
		 iserv.deleteSerie(id);
	}
	
	@PostMapping(value = "/serie/update")
	public void updateserie(@RequestBody Serie serie){
		iserv.updateSerie(serie);
	}
}
