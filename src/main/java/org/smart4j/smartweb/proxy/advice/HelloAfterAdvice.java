package org.smart4j.smartweb.proxy.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class HelloAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object result, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After");
	}

}
