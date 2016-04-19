package com.thousun.springframework.aop.introductionadvisor;

public interface Lockable {
	void lock();
	void unlock();
	boolean locked();
}
