package tw.brad.bs2.service;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HotelServiceImpl implements HotelService{

	@Override
	public void addHotelFromUrl(String url) {
		RestTemplate restTemplate = new RestTemplate();
		String content = restTemplate.getForObject(url, String.class);
		System.out.println(content);
	}

}
