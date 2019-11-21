package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.Car;
import tacotroc.api.tacotroc.service.interfaces.ICarService;

@RestController
@CrossOrigin("*")
public class CarController {
	
	
	@Autowired
	ICarService iserv;
	
	@GetMapping(value="/cars")
	public List<Car> allcar(){
	return iserv.allCar();
	}
	
	@GetMapping(value="/cars/{id}")
	public Car allcar(@PathVariable long id){
	return iserv.allCar(id);
	}
	
	@PostMapping(value="/cars/add")
	public void addcar(@RequestBody  Car car){
		 iserv.addCar(car);
	}
	
	@GetMapping(value="/cars/delete/{id}")
	public void deletecar(@PathVariable long id){
		 iserv.deleteCar(id);
	}
	
	@PostMapping(value = "/cars/update")
	public void updateCar(@RequestBody Car car){
		iserv.updateCar(car);
	}
	
	

}
