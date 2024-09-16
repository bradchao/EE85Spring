package tw.brad.bs2.controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 注意: thymeleaf ==> Controller
 */

@Controller
public class MyController {
	
	@GetMapping("/index.html")
	public String home() {
		return "index";	// thymeleaf => templates => xxx.html
	}
}
