package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Type;
import tacotroc.api.tacotroc.service.interfaces.ITypeService;

@RestController
@CrossOrigin("*")
public class TypeController {

	@Autowired
	ITypeService iserv;
	
	@GetMapping(value="/type")
	public List<Type> alltype(){
	return iserv.allType();
	}
	@GetMapping(value="/type/{id}")
	public Type alltype(@PathVariable int id){
	return iserv.allType(id);
	}
	
	@GetMapping(value="/type/add/{name}")
	public void addtype(@PathVariable String name){
		 iserv.addType(name);
	}
	
	@GetMapping(value="/type/delete/{id}")
	public void deleteType(@PathVariable int id){
		 iserv.deleteType(id);
	}
	
	@PostMapping(value = "/type/update")
	public void updateType(@RequestBody Type type){
		iserv.updateType(type);
	}
	
}
