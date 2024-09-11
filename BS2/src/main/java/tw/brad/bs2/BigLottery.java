package tw.brad.bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BigLottery implements Lottery{
	
	@Override
	public Integer createLottery() {
		return null;
	}

}
