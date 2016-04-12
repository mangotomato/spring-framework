package com.thousun.springframework.ioc.customtag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends	NamespaceHandlerSupport {
	
	public void init() {
		//注册自定义标签解析器
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}

}
