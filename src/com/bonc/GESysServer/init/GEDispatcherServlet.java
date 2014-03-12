package com.bonc.GESysServer.init;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import org.apache.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
/**
 * 封装 Spring MVC中的DispatcherServlet 方便后期的管理
 * @author xiangzheng 
 * @see org.springframework.web.servlet.DispatcherServlet
 * */
public class GEDispatcherServlet extends DispatcherServlet {
	
	private static final long serialVersionUID = 7976791347183908334L;
	private static WebApplicationContext app = null;
	private static  Logger logger = Logger.getLogger(GEDispatcherServlet.class);
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		logger.info("GESysSever servlet init ...");
		
	}
	@Override
	public void destroy() {
		logger.info("GESysSever servlet had been destroyed ...");
		super.destroy();
	}

	@Override
	protected WebApplicationContext initWebApplicationContext() {
		app = super.initWebApplicationContext();
		return app;
	}

}
