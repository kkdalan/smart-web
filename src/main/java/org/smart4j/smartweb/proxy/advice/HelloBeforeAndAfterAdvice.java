package org.smart4j.smartweb.proxy.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class HelloBeforeAndAfterAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Before");
	}

	@Override
	public void afterReturning(Object result, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After");
	}
}
