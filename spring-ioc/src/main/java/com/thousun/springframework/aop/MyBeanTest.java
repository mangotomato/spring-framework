package com.thousun.springframework.aop;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thousun.springframework.aop.introductionadvisor.Lockable;

public class MyBeanTest {
	
	@Test
	public void testMyBean() {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop/aspectTest.xml");
		TestBean bean = (TestBean) context.getBean("test");
		Lockable lockable = (Lockable) bean;
		lockable.lock();
		Assert.assertEquals(lockable.locked(), true);
		bean.test();
	}
}
