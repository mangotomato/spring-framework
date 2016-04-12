package com.thousun.springframework.ioc;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class BeanFactoryTestSince3_1 {
	
	@Test
	public void testSimpleLoad() {
		
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(beanFactory);
		xbdr.loadBeanDefinitions("beans.xml");
		
		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		Assert.assertEquals("testStr", myTestBean.getTestStr());
		
	}
}
