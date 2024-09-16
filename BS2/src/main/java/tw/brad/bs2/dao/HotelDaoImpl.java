package tw.brad.bs2.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import tw.brad.bs2.model.Hotel;

@Component
public class HotelDaoImpl implements HotelDao{

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public Hotel add(Hotel hotel) {
		return null;
	}

	@Override
	public Integer add(List<Hotel> hotels) {
		String sql = "INSERT INTO hotel (name,addr,tel) VALUES (:name, :addr, :tel)";
		
		MapSqlParameterSource[] sources =  new MapSqlParameterSource[hotels.size()];
		for (int i=0; i<hotels.size(); i++) {
			Hotel hotel =  hotels.get(i);
			sources[i] = new MapSqlParameterSource();
			sources[i].addValue("name", hotel.getName());
			sources[i].addValue("addr", hotel.getAddress());
			sources[i].addValue("tel", hotel.getTel());
		}
		
		int[] nums = namedParameterJdbcTemplate.batchUpdate(sql, sources);
		int sum = 0;
		for (int n : nums) sum += n;
				
		return Integer.valueOf(sum);
	}

}
