package com.bonc.GESysServer.aspect;

import java.util.List;

import javax.annotation.Resource;

import net.sf.ehcache.Cache;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ehcach 缓存的advice管理类
 * 
 * @author xiangzheng
 * @date 2013-10-29
 * @see 切点管理类 {@link EhcachPointcuts}
 * 
 * */
@Component
@Aspect
public class EhcacheAdvice implements InitializingBean{
	@Resource
	private Cache ehCache;
	private static Logger log = Logger.getLogger(EhcacheAdvice.class);
	
	/**
	 * 当执行com.bonc.GESysServer.Server及其子包下find*的方法前
	 * */
	@Before(value = "com.bonc.GESysServer.aspect.EhcachPointcuts.findMethod()")
	public void beforeFind(JoinPoint joinPoint) {
		log.debug("----find方法执行前被拦截---------");
	}
	/**
	 * find 方法的环绕通知
	 * */
	@Around(value="com.bonc.GESysServer.aspect.EhcachPointcuts.findMethod()")
	public void aroundFind(ProceedingJoinPoint pjp){
		//实现逻辑，方法执行过程中，进行cache管理，
		Object obj = null;
		try{
			System.out.println("around start");
			obj = pjp.proceed();
			System.out.println("around end");
		}catch(Throwable e){
				e.printStackTrace();
		}
			//return obj;  
	}
	
	/**
	 * 增删改查时更新cache或删除cache
	 * */
	@AfterReturning(pointcut="com.bonc.GESysServer.aspect.EhcachPointcuts.findMethod()")
	public void afterFindReturn(){
		// 实现逻辑，当进行更改或删除操作移除对应的cache，find方法仅为参考
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		if (ehCache==null) throw new Exception("can`t find a available cache,there is something wrong with the ehcach config!"); 
	}
	
	public void setCache(Cache ehCache) {
		this.ehCache = ehCache;
	}
	
}
