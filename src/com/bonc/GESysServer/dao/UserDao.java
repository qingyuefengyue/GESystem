package com.bonc.GESysServer.dao;

import com.bonc.GESysServer.pojo.User;

public interface UserDao {
	public boolean userReg(User user);
	public boolean userLogin(User user);
}
