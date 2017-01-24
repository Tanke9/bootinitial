package bootinicial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootinicial.model.User;
import bootinicial.service.UserService;

@RestController
public class InitialRestController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello world";
	}
	
//	@GetMapping("/all-users")
//	public String allUsers(){
//		return userService.findAll().toString();
//	}
//	
//	@GetMapping("/save-user")
//	public String saveUser(@RequestParam String name, @RequestParam String login, @RequestParam String password, 
//			@RequestParam String email, @RequestParam int rol){
//		
//		User user = new User(name, login, password, email, rol);
//		userService.save(user);
//		return "User saved!";
//	}
//	
//	@GetMapping("/delete-user")
//	public String deleteUser(@RequestParam int id){
//		userService.delete(id);
//		return "User deleted!";
//	}
	
}
