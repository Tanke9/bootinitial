package bootinicial.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import bootinicial.model.User;
import bootinicial.service.UserService;

@Controller
public class MainController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("/all-users")
	public String allUsers(HttpServletRequest request){
		request.setAttribute("users", userService.findAll());
		request.setAttribute("mode", "MODE_USERS");
		return "index";
	}
	
	@GetMapping("/new-user")
	public String newUser(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-user")
	public String saveUser(@ModelAttribute User user, BindingResult bindingResult, HttpServletRequest request){
		userService.save(user);
		request.setAttribute("users", userService.findAll());
		request.setAttribute("mode", "MODE_USERS");
		return "index";
	}
	
	@GetMapping("/update-user")
	public String updateUser(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("user", userService.findUser(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-user")
	public String deleteUser(@RequestParam int id, HttpServletRequest request){
		userService.delete(id);
		request.setAttribute("users", userService.findAll());
		request.setAttribute("mode", "MODE_USERS");
		return "index";
	}
}
