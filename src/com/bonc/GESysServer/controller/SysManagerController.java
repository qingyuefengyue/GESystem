package com.bonc.GESysServer.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bonc.GESysServer.mybitis.model.SysManagerInfo;
import com.bonc.GESysServer.service.SysManagerService;
import com.bonc.GESysServer.utils.mybitis.CommonUtil;
import com.bonc.GESysServer.utils.view.JsonView;

/**
 * @author xz
 * @date 2014-03-09
 * @desc 系统管理员controller层,用于处理系统管理员登陆，注册，修改密码等操作
 * */
@Controller
//@SessionAttributes("currentUser")
@RequestMapping("/sysManager")
public class SysManagerController {
	
	/**用户登陆成功 加载管理主页*/
	private final static String LOGINSUCCESS = "/manager/sysControlIndex";
	/**用户登陆失败,跳转到登陆页面*/
	private final static String LOGINFAILED = "/manager/managerLogin";
	
	@Autowired
	private SysManagerService sysManagerService; 
	
	/**
	 * 系统管理员登陆页面
	 * */
	@RequestMapping("/")
	public String sysLoginIndex(){

		return "/manager/managerLogin";
	}
	
	/**
	 * 用户登陆信息验证 如果验证成功，将用户信息保存到session
	 * 中
	 * 
	 * */
//	 @ModelAttribute("currentUser")SysManagerInfo currentUser, 
	@RequestMapping("/sysLogin")
	public ModelAndView sysLogin(SysManagerInfo sysManagerInfo,HttpServletResponse response){
		/**
		 * 登陆成功后,将用户信息存放到session 中,
		 * */
		//http://blog.csdn.net/linchengzhi/article/details/7532378
		Map<String,Object> errorMap = new HashMap<String, Object>();
		errorMap.put("flag", false);
		//验证用户名和密码
		if(sysManagerInfo != null){
			String loginUser = sysManagerInfo.getManagerAccount();
			String loginPWD = sysManagerInfo.getManagerPwd();
			if(!CommonUtil.isEmpty(loginUser)){
				//返回错误视图 用户名不能为空
				errorMap.put("msg", "账号不能为空!");
				return JsonView.Render(errorMap, response);
			}
			if(!CommonUtil.isEmpty(loginPWD)){
				//返回错误视图 提示用户密码不能为空
				errorMap.put("msg", "登陆密码不能空!");
				return JsonView.Render(errorMap, response);
			}
			SysManagerInfo currentMangerinfo = sysManagerService.confirmLoginInfo(sysManagerInfo);
			if(currentMangerinfo != null){
				//将用户信息存放到Session中
				ModelAndView mv = new ModelAndView(LOGINSUCCESS);
				//currentUser = currentMangerinfo;
                return mv;//返回注册失败页面  
			}else{
				//返回错误视图 提示用户或密码错误
				errorMap.put("msg", "账号或密码不正确，请重新输入!");
				return JsonView.Render(errorMap,response);
			}
			
		}else{
			//返回错误json 提示用户的账户和密码不能为空
			errorMap.put("msg", "登陆账号和密码不能为空!");
			return JsonView.Render(errorMap, response);
		}
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
//	public String authMenu(SysManagerInfo sysManagerInfo){
//		/** 管理员账号*/
//		managerService.getAuthMenuByUserCount(sysManagerInfo);
//		
//		
//		return "";
//	}
//	/**
//	 *  忘记密码 ，获取新的登陆密码
//	 *  
//	 * */
//	public String forgetPwd(SysManagerInfo sysManagerInfo){
//		return null;
//	}
}
