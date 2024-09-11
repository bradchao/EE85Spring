package tw.brad.bs2;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PowerLottery  implements Lottery, InitializingBean{
	
	public PowerLottery() {
		System.out.println("PowerLottery()");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}
	
	
	@Override
	public Integer createLottery() {
		return null;
	}


}