package com.thousun.springframework.ioc;

public class MyTestBean {
	
	private DependOn depend;
	
	public DependOn getDepend() {
		return depend;
	}

	public void setDepend(DependOn depend) {
		this.depend = depend;
	}

	private String testStr = "testStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}
	
	
}
