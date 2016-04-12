package com.thousun.springframework.ioc.lookup;

public abstract class GetBeanTest {
	
	public void showMe() {
		
		//实际返回的bean在配置文件中指定，在设计某些可插拔的功能上，解除程序依赖
		getBean().showMe();
	}
	
	public abstract User getBean();

}
