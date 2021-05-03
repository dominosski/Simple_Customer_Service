package com.aop;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
@Component
public class LoggingAspect {
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.controller.*.*(..))")
	private void controllerPackage() {}
	
	@Pointcut("execution(* com.service.*.*(..))")
	private void servicePackage() {}
	
	@Pointcut("execution(* com.DAO.*.*(..))")
	private void daoPackage() {}
	
	@Pointcut("controllerPackage() || servicePackage() || daoPackage()")
	private void forAppFlow() {}
	
	@Before("forAppFlow()")
	public void before(JoinPoint joinPoint)
	{
		String method = joinPoint.getSignature().toShortString();
		
		logger.info("===> in @Before: calling method: " + method);
		
		Object[] args = joinPoint.getArgs();
		
		for(Object tempArgObject : args)
		{
			logger.info("====> argument: " + tempArgObject);
		}
	}
	
	@AfterReturning(pointcut = "forAppFlow()", returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result)
	{
		String method = joinPoint.getSignature().toShortString();
		
		logger.info("===> in @AfterReturning: calling method: " + method);
		
		logger.info("===> result: " + result);
	}
}
