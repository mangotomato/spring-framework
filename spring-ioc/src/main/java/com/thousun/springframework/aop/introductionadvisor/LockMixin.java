package com.thousun.springframework.aop.introductionadvisor;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable{
	private boolean isLocked;
	public void lock() {
		this.isLocked = true;
	}

	public void unlock() {
		this.isLocked = false;
	}

	public boolean locked() {
		return this.isLocked;
	}
	
	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		if(locked() && mi.getMethod().getName().indexOf("set")==0) {
			throw new UnsupportedOperationException();
		}
		return super.invoke(mi);
	}

}
