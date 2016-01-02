package my.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import my.service.IUserService;

@Service(value="userService")
public class UserServiceImpl implements IUserService {

	private static Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		logger.info("oh,successful!");
	}

}
