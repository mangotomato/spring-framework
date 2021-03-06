package com.thousun.springframework.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

import com.thousun.springframework.aop.introductionadvisor.Lockable;

@Aspect
public class AspectJTest {
	
	/**
	 * 引介增强
	 */
	@DeclareParents(value="com.thousun.springframework.aop.TestBean"
			,defaultImpl=com.thousun.springframework.aop.introductionadvisor.LockMixin.class)
	private Lockable lock;
	
	@Pointcut("execution (* *.test(..))")
	public void test() {
		
	}
	
	@Before("test()")
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@After("test()")
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	
	
	
	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint pjp) {
		System.out.println("before1");
		Object o = null;
		try {
			o = pjp.proceed();
		} catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("after1");
		
		return o;
	}
}
