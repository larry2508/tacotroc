package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Color;
import tacotroc.api.tacotroc.beans.Version;
import tacotroc.api.tacotroc.service.interfaces.IVersionService;


@RestController
@CrossOrigin("*")
public class VersionController {


	@Autowired
	IVersionService iversionserv;
	
	@GetMapping(value="/version")
	public List<Version> allversion(){
	return iversionserv.allVersion();
	}
	@GetMapping(value="/version/{id}")
	public Version allversion(@PathVariable int id){
	return iversionserv.allVersion(id);
	}
	
	@GetMapping(value="/version/add/{name}")
	public void addversion(@PathVariable String name){
		 iversionserv.addCVersion(name);
	}
	
	@GetMapping(value="/version/delete/{id}")
	public void addversion(@PathVariable int id){
		 iversionserv.deleteVersion(id);
	}
	
	@PostMapping(value = "/version/update")
	public void updateversions(@RequestBody Version version){
		iversionserv.updateColor(version);
	}
	
}
