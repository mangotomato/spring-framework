package com.thousun.springframework.ioc.autowire;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
	
	@Test
	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory((new ClassPathResource("autowire.xml")));
		MyUserBean bean = (MyUserBean) bf.getBean("myUserBean");
		System.out.println(bean);
	}
}
