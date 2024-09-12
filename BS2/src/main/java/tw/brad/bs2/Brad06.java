package tw.brad.bs2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/brad06")
@RestController
public class Brad06 {

	@RequestMapping("/m1")
	public String m1() {
		return "brad06";
	}
	
}
