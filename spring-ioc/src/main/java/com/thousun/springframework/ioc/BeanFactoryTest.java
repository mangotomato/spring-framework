package com.thousun.springframework.ioc;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
	
	@Test
	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory((new ClassPathResource("beans.xml")));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		
		System.out.println(bean.getDepend());
		Assert.assertEquals("testStr", bean.getTestStr());
	}
}
