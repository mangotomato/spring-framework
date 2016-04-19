package com.thousun.springframework.ioc.extend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thousun.springframework.ioc.MyTestBean;

public class ApplicationContextTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("beans.xml");
		MyTestBean bean = (MyTestBean) applicationContext.getBean("myTestBean");
		System.out.println(bean.getTestStr());
	}
}
