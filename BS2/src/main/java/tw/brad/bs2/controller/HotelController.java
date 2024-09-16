package tw.brad.bs2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.bs2.service.HotelService;

@RequestMapping("/hotel")
@RestController
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/addHotels")
	public void addHotels() {
		String url = "https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelStay.aspx";
		hotelService.addHotelFromUrl(url);
	}
	
	
}
