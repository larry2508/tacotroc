package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Owner;
import tacotroc.api.tacotroc.service.interfaces.IOwnerService;

@RestController
@CrossOrigin("*")
public class OwnerController {

	@Autowired
	IOwnerService iserv;

	@GetMapping(value="/proprio")
	public List<Owner> allowner(){
		return iserv.allOwner();
	}

	@GetMapping(value="/proprio/{id}")
	public Owner allowner(@PathVariable int id){
		return iserv.allOwner(id);
	}

	@GetMapping(value="/proprio/delete/{id}")
	public void deleteowner(@PathVariable int id){
		iserv.deleteOwner(id);
	}
	//avec id pour MAJ
	@PostMapping(value = "/proprio/update")
	public void updateowner(@RequestBody Owner user){
		iserv.addOwner(user);
	}
	//sans id pour ajout
	@PostMapping(value = "/proprio/add")
	public void addowner(@RequestBody Owner user){
		iserv.addOwner(user);
	}

}
