package com.bonc.GESysServer.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 管理切入点，提供所有所需的切入点定义
 * 
 * @author xiangzheng
 * @date 2013-10-28
 * @see 切点管理类 {@link EhcacheAdvice}
 * */
@Component
@Aspect
public class EhcachPointcuts {
	/**
	 * execution最常用,可以通过 & || !进行切入点表达式的连接 可是是表达式，可以通过切入点标识重用表达式
	 * 声明一个切入点第一个*号返回类型,test后面 ..代表包及下面子包【不写就只代表当前包】,*所有方法,(..)方法的参数
	 * **/

	/**
	 * 当执行com.bonc.GESysServer.Server及其子包下find*的方法时会进行切面管理
	 * */
	@Pointcut("execution(* com.bonc.GESysServer.service..find*(..))")
	public void findMethod() {}

}
