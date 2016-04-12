package com.hundsun.springframework.ioc.lookup;

public class Teacher extends User{
	@Override
	public void showMe() {
		System.out.println("I'm a teacher.");
	}
	
}
