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
	IColorService icolorserv;
	
	@GetMapping(value="/color")
	public List<Color> allcolor(){
	return icolorserv.allColor();
	}
	
	@GetMapping(value="/color/{id}")
	public Color allcolor(@PathVariable int id){
	return icolorserv.allColor(id);
	}
	
	@GetMapping(value="/color/add/{name}")
	public void addcolor(@PathVariable String name){
		 icolorserv.addColor(name);
	}
	
	@GetMapping(value="/color/delete/{id}")
	public void addcolor(@PathVariable int id){
		 icolorserv.deleteColor(id);
	}
	
	@PostMapping(value = "/color/update")
	public void updateColor(@RequestBody Color color){
		icolorserv.updateColor(color);
	}
	


}
