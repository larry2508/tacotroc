package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Adresse;
import tacotroc.api.tacotroc.service.interfaces.IAdresseService;

@RestController
@CrossOrigin("*")
public class AdresseController {
	@Autowired
	IAdresseService iserv;

	@GetMapping(value="/adresse")
	public List<Adresse> allAdresseS(){
		return iserv.allAdresse();
	}

	@GetMapping(value="/adresse/{id}")
	public Adresse allAdresse(@PathVariable int id){
		return iserv.allAdresse(id);
	}

	@GetMapping(value="/adresse/delete/{id}")
	public void deleteAdresse(@PathVariable int id){
		iserv.deleteAdresse(id);
	}
	//avec id pour MAJ
	@PostMapping(value = "/adresse/update")
	public void updateAdresse(@RequestBody Adresse adresse){
		iserv.addAdresse(adresse);
	}
	//sans id pour ajout
	@PostMapping(value = "/adresse/add")
	public void addAdresse(@RequestBody Adresse adresse){
		iserv.addAdresse(adresse);
	}
}
