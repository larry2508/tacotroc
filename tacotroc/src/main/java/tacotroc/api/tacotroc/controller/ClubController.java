package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Club;
import tacotroc.api.tacotroc.service.interfaces.IClubService;

@RestController
@CrossOrigin("*")
public class ClubController {
	@Autowired
	IClubService iserv;
	
	@GetMapping(value="/club")
	public List<Club> allclub(){
	return iserv.allClub();
	}
	
	@GetMapping(value="/club/{id}")
	public Club allclub(@PathVariable int id){
	return iserv.allClub(id);
	}
	
	@GetMapping(value="/club/add/{name}")
	public void addClub(@PathVariable String name){
		 iserv.addClub(name);
	}
	
	@GetMapping(value="/club/delete/{id}")
	public void deleteclub(@PathVariable int id){
		 iserv.deleteClub(id);
	}
	
	@PostMapping(value = "/club/update")
	public void updateclub(@RequestBody Club club){
		iserv.updateClub(club);
	}
	

}
