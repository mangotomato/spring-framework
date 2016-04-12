package com.thousun.springframework.ioc.replace;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class TestMethodReplacer implements MethodReplacer {

	public Object reimplement(Object obj, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("替换了原来的方法");
		return null;
	}

}
