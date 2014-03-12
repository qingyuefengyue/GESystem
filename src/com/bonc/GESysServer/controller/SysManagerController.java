package com.bonc.GESysServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bonc.GESysServer.pojo.SysManagerInfo;
import com.bonc.GESysServer.service.SysManagerService;

/**
 * @author xz
 * @date 2014-03-09
 * @desc 系统管理员controller层,用于处理系统管理员登陆，注册，修改密码等操作
 * */
@Controller
@SessionAttributes("currentUser")
@RequestMapping("/sysManager")
public class SysManagerController {
	
	/**用户登陆成功 加载管理主页*/
	private final static String LOGINSUCCESS = "sysControlIndex";
	/**用户登陆失败,跳转到登陆页面*/
	private final static String LOGINFAILED = "managerLogin";
	
	@Autowired
	private SysManagerService managerService; 
	
	/**
	 * 系统管理员登陆页面
	 * */
	@RequestMapping("/")
	public String sysLoginIndex(){

		return "managerLogin";
	}
	
	/**
	 * 用户登陆信息验证 如果验证成功，将用户信息保存到session
	 * 中
	 * 
	 * */
	public String sysLogin(@ModelAttribute("currentUser")SysManagerInfo sysManagerInfo,@ModelAttribute("SessionIdentifyingCode;")String SessionIdentifyingCode,String loginIdentifyCode){
		/**
		 * 将用户信息存放到session 中,
		 * */
		// 异步验证 ①验证码 ② 用户名密码
		if(loginIdentifyCode != null && SessionIdentifyingCode != null && SessionIdentifyingCode.equals(loginIdentifyCode)){
			//通过密码和账号获得用户信息
			sysManagerInfo = managerService.confirmLoginInfo(sysManagerInfo);
			//为null则说明该用户不存在
			if(sysManagerInfo != null){
				return LOGINSUCCESS;
			}
		}
		return LOGINFAILED;
		//controller之间的跳转
//		return "redirect:/ toList ";
	}
	
	/**
	 * 用户修改密码
	 * */
	public String recordPWD(){
		
		return "";
	}
	
	/**
	 * 修改管理员个人信息
	 * */
	public String updateMangerInfo(){
		
		return "";
	}
	
	/**
	 * 根据用户id 加载管理员授权菜单
	 * */
	public String authMenu(SysManagerInfo sysManagerInfo){
		/** 管理员账号*/
		managerService.getAuthMenuByUserCount(sysManagerInfo);
		
		
		return "";
	}
	/**
	 *  忘记密码 ，获取新的登陆密码
	 *  
	 * */
	public String forgetPwd(SysManagerInfo sysManagerInfo){
		return null;
	}
}
