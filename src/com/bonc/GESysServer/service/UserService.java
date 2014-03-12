package com.bonc.GESysServer.service;

import com.bonc.GESysServer.pojo.User;

public interface UserService {
	public boolean userLogin(User user);
	public boolean userReg(User user);
	public boolean find(User user);
}
