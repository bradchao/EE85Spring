package tw.brad.bs2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.bs2.model.User;
import tw.brad.bs2.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "addUser";
	}
	
}
