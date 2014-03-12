package com.bonc.GESysServer.controller;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
public class UserControllerTest extends JUnitControllerBase {
	@Autowired
	private UserController controller;
	@Test
	public void testUserLogin() throws Exception{
		MockHttpServletRequest request = new MockHttpServletRequest();
		MockHttpServletResponse response = new MockHttpServletResponse();
		request.setServletPath("/login");
		request.addParameter("userName","张三");
		request.addParameter("password","123456");
		request.setMethod("post");
		request.setAttribute("msg","测试action成功");
		final ModelAndView mav = this.excuteController(request,response);
		Assert.assertEquals("login_success",mav.getViewName());
		String msg=(String)request.getAttribute("msg");
		System.out.println(msg);
	}
}
