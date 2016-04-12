package com.thousun.springframework.ioc.lookup;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class MyLookupTest {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xbdr = new XmlBeanDefinitionReader(beanFactory);
		xbdr.loadBeanDefinitions("lookupTe      st.xml");
		
		GetBeanTest getBeanTest = (GetBeanTest) beanFactory.getBean("getBeanTest");
		getBeanTest.showMe();	//print I'm a teacher.

	}
}	
