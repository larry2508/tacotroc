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
import tacotroc.api.tacotroc.service.interfaces.IColorService;


@RestController
@CrossOrigin("*")
public class ColorController {
	
	
	@Autowired
	IColorService iserv;
	
	@GetMapping(value="/color")
	public List<Color> allcolor(){
	return iserv.allColor();
	}
	
	@GetMapping(value="/color/{id}")
	public Color allcolor(@PathVariable long id){
	return iserv.allColor(id);
	}
	
	@GetMapping(value="/color/add/{name}")
	public void addcolor(@PathVariable String name){
		 iserv.addColor(name);
	}
	
	@GetMapping(value="/color/delete/{id}")
	public void deletecolor(@PathVariable long id){
		 iserv.deleteColor(id);
	}
	
	@PostMapping(value = "/color/update")
	public void updateColor(@RequestBody Color color){
		iserv.updateColor(color);
	}
	


}
