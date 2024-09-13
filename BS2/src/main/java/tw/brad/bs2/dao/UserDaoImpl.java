package tw.brad.bs2.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import tw.brad.bs2.model.User;

@Component
public class UserDaoImpl implements UserDao{

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Override
	public void add(User user) {
		String sql = "INSERT INTO user (account,passwd,name) VALUES (:account, :passwd, :name)";
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("account", user.getAccount());
		map.put("passwd", user.getPasswd());
		map.put("name", user.getName());
		
		namedParameterJdbcTemplate.update(sql, map);
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getByAccount(String account) {
		// TODO UserDaoImpl getByAccount...not yet 
		return null;
	}

}
