package com.bonc.GESysServer.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.bonc.GESysServer.dao.UserDao;
import com.bonc.GESysServer.pojo.User;
import com.bonc.GESysServer.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	private static Logger log = Logger.getLogger(UserServiceImpl.class);
	@Resource
	private UserDao userDao;
	
	@Override
	public boolean userLogin(User user) {
		return userDao.userLogin(user);

	}

	@Override
	public boolean userReg(User user) {
		return userDao.userReg(user);
	}

	@Override
	public boolean find(User user) {
		log.info("----find 方法");
		return false;
	}
	
}
