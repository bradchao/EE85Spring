package tw.brad.bs2;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
 * RequestParam => url?x=10&y=3
 * RequestBody
 * RequestHeader
 * PathVariable ==> RESTFul Style
 */
@RestController
public class Brad07 {
	
	@RequestMapping("/brad071")
	public String brad071(@RequestParam(name = "xxx") Integer x, 
					@RequestParam(required = false, defaultValue = "0") Integer y,
					@RequestParam String name) {
		int r = x + y;
		System.out.println(name + ":" + r);
		return "brad071";
	}
	
	@RequestMapping("/brad072")
	public String brad072(@RequestBody User user) {
		System.out.println(user.getId() + ":" + user.getName());
		return "brad072";
	}
	
	@RequestMapping("/brad073")
	public String brad073(@RequestHeader(name = "Content-Type") String contentType, 
						@RequestBody User user) {
		System.out.println(contentType + ":" + user.getId() + ":" + user.getName());
		return "brad073";
	}
	
	@RequestMapping("/brad074/user/{id}")
	public String brad074(@PathVariable Integer id) {
		System.out.println(id);
		return "brad074";
	}
	
}







