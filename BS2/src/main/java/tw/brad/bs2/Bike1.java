package tw.brad.bs2;

import org.springframework.stereotype.Component;

@Component
public class Bike1 implements Bike{
	
	public Bike1() {
		System.out.println("Bike1");
	}
	
	@Override
	public void upSpeed() {
		System.out.println("Bike1:upSpeed()");
	}

	@Override
	public void downSpeed() {
		System.out.println("Bike1:downSpeed()");
	}

}
