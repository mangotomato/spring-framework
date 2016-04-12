package com.thousun.springframework.ioc.customtag;

public class User {
	private String id;
	private String email;
	private String userName;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", userName=" + userName
				+ "]";
	}
	
	
	
	
}
