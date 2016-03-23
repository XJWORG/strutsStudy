package com.interceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

	private Object object;
	private Interceptor interceptor = new Interceptor();
	
	public void setObject(Object object) {
		this.object = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		this.interceptor.before();
		result = method.invoke(object, args);
		this.interceptor.after();
		
		return null;
	}

}
