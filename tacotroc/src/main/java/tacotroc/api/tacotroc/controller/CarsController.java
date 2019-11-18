package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Cars;
import tacotroc.api.tacotroc.service.interfaces.ICarsService;

@RestController
@CrossOrigin("*")
public class CarsController {
	@Autowired
	ICarsService iserv;

	@GetMapping(value="/cars")
	public List<Cars> allCars(){
		return iserv.allCars();
	}

	@GetMapping(value="/cars/{id}")
	public Cars allAdresse(@PathVariable int id){
		return iserv.allCars(id);
	}

	@GetMapping(value="/cars/delete/{id}")
	public void deleteAdresse(@PathVariable int id){
		iserv.deleteCars(id);
	}
	//avec id pour MAJ
	@PostMapping(value = "/cars/update")
	public void updateAdresse(@RequestBody Cars cars){
		iserv.addCars(cars);
	}
	//sans id pour ajout
	@PostMapping(value = "/cars/add")
	public void addCars(@RequestBody Cars cars){
		iserv.addCars(cars);
	}
}
