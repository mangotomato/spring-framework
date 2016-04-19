package com.thousun.springframework.ioc.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyAnnotationBean implements BeanPostProcessor, BeanFactoryPostProcessor {

	private static BeanFactory beanFactory;
	
	public void postProcessBeanFactory(
			ConfigurableListableBeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}
	

	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		return null;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		return null;
	}

}
