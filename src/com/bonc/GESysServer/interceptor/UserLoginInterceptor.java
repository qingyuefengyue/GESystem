package com.bonc.GESysServer.interceptor;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


	/**
	 * 客户端访问ACTION时需要被此拦截器进行拦截进行权限认证
	 * 通过user_code,password,imei进行用户验证
	 * 验证通过则向下调用，否则中断ACTION的访问
	 * @author litao
	 *
	 */
	public class UserLoginInterceptor implements HandlerInterceptor{
		
		//记录日志文件到${catalina.base}/logs/jroo/AccessRecordFile.log
		private static Logger log = Logger.getLogger(UserLoginInterceptor.class);

		@Override
		public boolean preHandle(HttpServletRequest request,
				HttpServletResponse response, Object handler) throws Exception {
			// TODO Auto-generated method stub
			log.debug("我是拦截器---------------------------------------------");
			return true;
		}

		@Override
		public void postHandle(HttpServletRequest request,
				HttpServletResponse response, Object handler,
				ModelAndView modelAndView) throws Exception {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void afterCompletion(HttpServletRequest request,
				HttpServletResponse response, Object handler, Exception ex)
				throws Exception {
			// TODO Auto-generated method stub
			
		}

		
}

