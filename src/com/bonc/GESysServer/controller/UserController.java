package com.bonc.GESysServer.controller;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bonc.GESysServer.core.DesUtil;
import com.bonc.GESysServer.pojo.User;
import com.bonc.GESysServer.service.UserService;

@Controller
@RequestMapping(value="/userController")
public class UserController {
	
	
	@Resource
	private UserService userService;
	private static Logger log = Logger.getLogger(UserController.class);
	@RequestMapping(value="/")
	public String index(HttpServletRequest request,HttpServletResponse response,Model model){
		return "manager/login";
	}
	@RequestMapping("/login") 
	public String userLogin(User user){
		//reques.getp("kpicodes");
		log.info("user="+user.getUserName()+"pass="+user.getPassword());
		log.info("用户登陆。。。");
		return userService.userLogin(user)?"login_success":"login_failed";
//		return "login_success";
		 
	}
	
	
	

	@RequestMapping(value="/loginIndex") 
	public String userLoginIndex(@RequestBody String key) throws JsonParseException, JsonMappingException, IOException{
		String str = DesUtil.desDecryptASUrlSafeBase64String(key, "sw123456");
		Map<String, String> map = new HashMap<String, String>();
		ObjectMapper objectMapper = new ObjectMapper();
		map = objectMapper.readValue(str, Map.class);
		String user = map.get("userName");
		String password = map.get("pass");
		System.out.println("userName = "+user+"--password ="+password);
		userService.find(null);
		return "login";
	}
	@RequestMapping(value="/jsonView") 
	public String testJson(HttpServletResponse response,String jsonValue,HttpServletRequest request ) throws JsonParseException, JsonMappingException, IOException{
		//String jsonValue="{\"userName\":\"test\",\"pass\":\"123\"}";
		response.setContentType("text/html; charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");
		try{
			byte[] bts = jsonValue.getBytes("UTF-8");
			response.setContentLength(bts.length);
			BufferedOutputStream bos =  new BufferedOutputStream(response.getOutputStream());
			bos.write(bts);
			bos.flush();
			bos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
		
		
		Map<String, String> map = new HashMap<String, String>();
		ObjectMapper objectMapper = new ObjectMapper();
		map = objectMapper.readValue("", Map.class);
		
		String user = map.get("userName");
		String password = map.get("pass");
		System.out.println("userName = "+user+"--password ="+password);
		userService.find(null);
		return "welcome";
	}
	
	@RequestMapping("/reg")
	public String userReg(User user){
		log.info("用户注册。。。");
		boolean flag = false;
		flag = userService.userReg(user);
		if(flag) return "reg_sucess";
		return "reg_failed";
	}
}
