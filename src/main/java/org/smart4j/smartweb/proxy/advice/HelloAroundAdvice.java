package org.smart4j.smartweb.proxy.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HelloAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		before();
		Object result = invocation.proceed();
		after();
		return result;
	}

	private void after() {
		System.out.println("After");
	}

	private void before() {
		System.out.println("Before");
	}

}
