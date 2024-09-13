package tw.brad.bs2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tw.brad.bs2.dao.UserDao;
import tw.brad.bs2.model.User;

@Component
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.add(user);
	}

}
