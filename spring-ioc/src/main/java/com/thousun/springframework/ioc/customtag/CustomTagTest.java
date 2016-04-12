package com.thousun.springframework.ioc.customtag;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CustomTagTest {
	
	@Test
	public void testCustomTag() {
		BeanFactory bf = new XmlBeanFactory((new ClassPathResource("customtag.xml")));
		User user = (User) bf.getBean("testBean");
		System.out.println(user);
	}
}
