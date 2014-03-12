package com.bonc.GESysServer.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import com.bonc.GESysServer.pojo.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:resources/*.xml"})
public class UserControllerTest1 {
	@Autowired
	private UserController controller;
	@Test
	public void testUserLogin() throws Exception{
		User user = new User();
		Assert.assertEquals("login_success",controller.userLogin(user));
	}
}
