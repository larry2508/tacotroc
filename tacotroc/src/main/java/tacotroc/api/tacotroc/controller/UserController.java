package tacotroc.api.tacotroc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tacotroc.api.tacotroc.beans.User;
import tacotroc.api.tacotroc.service.interfaces.IUserService;

@RestController
@CrossOrigin("*")
public class UserController {

	@Autowired
	IUserService iserv;

	@GetMapping(value="/user")
	public List<User> alluser(){
		return iserv.allUser();
	}

	@GetMapping(value="/user/{id}")
	public User alluser(@PathVariable int id){
		return iserv.allUser(id);
	}

	@GetMapping(value="/user/delete/{id}")
	public void deleteuser(@PathVariable int id){
		iserv.deleteUser(id);
	}
	//avec id pour MAJ
	@PostMapping(value = "/user/update")
	public void updateuser(@RequestBody User user){
		iserv.addUser(user);
	}
	//sans id pour ajout
	@PostMapping(value = "/user/add")
	public void adduser(@RequestBody User user){
		iserv.addUser(user);
	}

}
