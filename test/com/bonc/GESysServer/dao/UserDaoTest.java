package com.bonc.GESysServer.dao;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.bonc.GESysServer.pojo.User;

/**
 * dao层测试例子
 * @author fule
 *
 */
public class UserDaoTest extends JUnitDaoBase{
	@Autowired
	private UserDao userDao;
	@Test
	public void testUserDao() {
		User user = new User();
		user.setPassword("123456");
		user.setUserName("大妈");
		boolean flag = userDao.userLogin(user);
		Assert.assertTrue(flag);
	}
}


