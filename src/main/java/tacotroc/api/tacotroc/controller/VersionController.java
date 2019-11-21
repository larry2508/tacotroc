package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Version;
import tacotroc.api.tacotroc.service.interfaces.IVersionService;


@RestController
@CrossOrigin("*")
public class VersionController {


	@Autowired
	IVersionService iserv;
	
	@GetMapping(value="/version")
	public List<Version> allversion(){
	return iserv.allVersion();
	}
	@GetMapping(value="/version/{id}")
	public Version allversion(@PathVariable long id){
	return iserv.allVersion(id);
	}
	
	@GetMapping(value="/version/add/{name}")
	public void deleteversion(@PathVariable String name){
		 iserv.addCVersion(name);
	}
	
	@GetMapping(value="/version/delete/{id}")
	public void addversion(@PathVariable long id){
		 iserv.deleteVersion(id);
	}
	
	@PostMapping(value = "/version/update")
	public void updateversions(@RequestBody Version version){
		iserv.updateVersion(version);
	}
	
}
