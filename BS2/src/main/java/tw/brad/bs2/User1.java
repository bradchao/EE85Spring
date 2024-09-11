package tw.brad.bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User1 {
	@Autowired
	private Bike bike;
	
	public User1() {
//		b1 = new Bike2();
		System.out.println("User1()");
		System.out.println(bike == null);
	}
	
	public void rideBike() {
		bike.upSpeed();
	}
}
