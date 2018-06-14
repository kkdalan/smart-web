package org.smart4j.smartweb.proxy;

import org.smart4j.smartweb.proxy.advice.HelloAroundAdvice;
import org.smart4j.smartweb.proxy.impl.HelloImpl;
import org.smart4j.smartweb.proxy.impl.HelloProxy;
import org.springframework.aop.framework.ProxyFactory;

public class HelloMain {

	public static void main(String[] args) {
		System.out.println("---- Test Static Proxy ----");
		testStaticProxy();
		
		System.out.println("---- Test Dynamic Proxy ----");
		testDynamicProxy();
		
		System.out.println("---- Test CGLib Proxy ----");
		testCGLibProxy();
		
		System.out.println("---- Test Spring AOP Proxy ----");
		testSpringAopProxy();
		
	 
	}

	private static void testSpringAopProxy() {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new HelloImpl());
//		proxyFactory.addAdvice(new HelloBeforeAdvice());
//		proxyFactory.addAdvice(new HelloAfterAdvice());
//		proxyFactory.addAdvice(new HelloBeforeAndAfterAdvice());
		proxyFactory.addAdvice(new HelloAroundAdvice());
		
		Hello helloProxy = (Hello) proxyFactory.getProxy();
		helloProxy.sayHello("Jack");
	}

	private static void testCGLibProxy() {
		Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
		helloProxy.sayHello("Jack");
	}

	private static void testDynamicProxy() {
		Hello hello = new HelloImpl();
		DynamicProxy dynamicProxy = new DynamicProxy(hello);
		Hello helloProxy = dynamicProxy.getProxy(); 
		helloProxy.sayHello("Jack");
	}

	private static void testStaticProxy() {
		Hello helloProxy = new HelloProxy();
		 helloProxy.sayHello("Jack");
	}

}
