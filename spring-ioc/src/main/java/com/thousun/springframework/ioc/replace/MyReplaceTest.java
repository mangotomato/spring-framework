package com.thousun.springframework.ioc.replace;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class MyReplaceTest {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(beanFactory);
		xbdr.loadBeanDefinitions("replaceTest.xml");
		
		TestChangeMethod testChangeMethod = (TestChangeMethod) beanFactory.getBean("getChangeMethod");
		testChangeMethod.changeMe();
	}
}	
