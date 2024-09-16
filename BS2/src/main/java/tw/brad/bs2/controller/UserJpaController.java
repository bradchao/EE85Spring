package tw.brad.bs2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.bs2.model.UserV2;
import tw.brad.bs2.repository.UserRepository;

@RestController
public class UserJpaController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/userjpa")
	public String add(@RequestBody UserV2 user) {
		userRepository.save(user);
		
		return "add";
	}
	
}
