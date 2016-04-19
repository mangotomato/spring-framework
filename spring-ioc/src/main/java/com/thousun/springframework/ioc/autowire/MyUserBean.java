package com.thousun.springframework.ioc.autowire;


public class MyUserBean {
	private String name;
	private int age;
	
	private Student student;
	
	private Teacher teacher;
	
	
	public Student getStudent() {
		return student;
	}

	public void setStudent1(Student student) {
		this.student = student;
	}

	public MyUserBean() {
		
	}
	
	public MyUserBean(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public MyUserBean(String name, int age, Teacher teacher) {
		super();
		this.name = name;
		this.age = age;
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "MyUserBean [name=" + name + ", age=" + age + "]"+student;
	}
	
	
	
}
