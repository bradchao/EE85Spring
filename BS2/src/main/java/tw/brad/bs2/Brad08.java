package tw.brad.bs2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/*
 * RESTful
 * POST : Create
 * GET : Read
 * PUT : Update
 * DELETE : Delete
 */

@RestController
public class Brad08 {
	@GetMapping("/users")
	public String brad081() {
		return "brad081";
	}
	@GetMapping("/users/{id}")
	public String brad082(@PathVariable Integer id) {
		return "brad082";
	}
	@GetMapping("/users/{id}/bikes")
	public String brad083(@PathVariable Integer id) {
		return "brad083";
	}
	@GetMapping("/users/{id}/bikes/{bid}")
	public String brad084(@PathVariable Integer id, 
			@PathVariable Integer bid) {
		return "brad084";
	}
	
	@PostMapping("/user")
	public String brad085(@RequestBody User user) {
		return "brad085";
	}
	
	@PutMapping("/user/{id}")
	public String brad086(@PathVariable Integer id,  @RequestBody User user) {
		return "brad086";
	}
	
	@DeleteMapping("/user/{id}")
	public String brad087(@PathVariable Integer id) {
		return "brad087";
	}
	
	
	
	
	
	
	
}
