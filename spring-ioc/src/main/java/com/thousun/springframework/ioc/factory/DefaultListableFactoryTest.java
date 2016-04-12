package com.thousun.springframework.ioc.factory;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class DefaultListableFactoryTest {
	
	@Test
	public void testAliasCircle() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		factory.registerAlias("test1", "test2");
		factory.registerAlias("test2", "test3");
		factory.registerAlias("test3", "test1");
		
	}
}
