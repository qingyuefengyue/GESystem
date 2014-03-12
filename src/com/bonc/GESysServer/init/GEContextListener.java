package com.bonc.GESysServer.init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;
/**
 * 实现servletContextListener接口
 * @author xiangzheng 
 * */
public class GEContextListener implements ServletContextListener {
	private static Logger log = Logger.getLogger(GEContextListener.class);
	@Override
	public void contextDestroyed(ServletContextEvent contextEvent) {
		//处理逻辑判断是否加载完成
		log.info("context init ...");
	}

	@Override
	public void contextInitialized(ServletContextEvent contextEvent) {
		log.info("context destroyed ...");
	}

}
