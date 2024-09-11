package tw.brad.bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class User2 {
	@Autowired
	private Bike bike;
	
	public User2() {
		//b1 = new Bike2();
	}
	
	public void rideBike() {
		bike.upSpeed();
	}
}
