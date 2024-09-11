package tw.brad.bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class BigLottery implements Lottery{
	
	public BigLottery() {
		System.out.println("BigLottery()");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("init()");
	}
	
	
	@Override
	public Integer createLottery() {
		return null;
	}

}
