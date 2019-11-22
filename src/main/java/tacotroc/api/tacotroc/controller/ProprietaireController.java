package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Proprietaire;
import tacotroc.api.tacotroc.service.interfaces.IProprietaireService;
@RestController
@CrossOrigin("*")
public class ProprietaireController {
	@Autowired
	IProprietaireService iserv ;
	
	
	@GetMapping(value="/owner")
	public List<Proprietaire> allowner(){
		return iserv.allOwner();
	}

	@GetMapping(value="/owner/{id}")
	public Proprietaire alluser(@PathVariable long id){
		return iserv.allOwner(id);
	}

	@GetMapping(value="/owner/delete/{id}")
	public void deleteuser(@PathVariable long id){
		iserv.deleteOwner(id);
	}
	//avec id pour MAJ
	@PostMapping(value = "/owner/update")
	public void updateowner(@RequestBody Proprietaire owner){
		iserv.addUser(owner);
	}
	//sans id pour ajout
	@PostMapping(value = "/owner/add")
	public void addowner(@RequestBody Proprietaire owner){
		iserv.addUser(owner);
	}
}
