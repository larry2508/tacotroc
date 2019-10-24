package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.AdresseS;
import tacotroc.api.tacotroc.service.interfaces.IAdresseSService;

@RestController
@CrossOrigin("*")
public class AdresseSController {

	@Autowired
	IAdresseSService iserv;

	@GetMapping(value="/adresseS")
	public List<AdresseS> allAdresseS(){
		return iserv.allAdresseS();
	}

	@GetMapping(value="/adresseS/{id}")
	public AdresseS allAdresseS(@PathVariable int id){
		return iserv.allAdresseS(id);
	}

	@GetMapping(value="/adresseS/delete/{id}")
	public void deleteAdresseS(@PathVariable int id){
		iserv.deleteAdresseS(id);
	}
	//avec id pour MAJ
	@PostMapping(value = "/adresseS/update")
	public void updateAdresseS(@RequestBody AdresseS adresseS){
		iserv.addAdresseS(adresseS);
	}
	//sans id pour ajout
	@PostMapping(value = "/adresseS/add")
	public void addAdresseS(@RequestBody AdresseS adresseS){
		iserv.addAdresseS(adresseS);
	}

}
