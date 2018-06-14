package org.smart4j.smartweb.proxy.impl;

import org.smart4j.smartweb.proxy.CGLibProxy;
import org.smart4j.smartweb.proxy.DynamicProxy;
import org.smart4j.smartweb.proxy.Hello;

public class HelloMain {

	public static void main(String[] args) {
		System.out.println(" ---- Test Static Proxy ----");
		testStaticProxy();
		
		System.out.println(" ---- Test Dynamic Proxy ----");
		testDynamicProxy();
		
		System.out.println(" ---- Test CGLib Proxy ----");
		testCGLibProxy();
	}

	private static void testCGLibProxy() {
		Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);
		helloProxy.say("Jack");
	}

	private static void testDynamicProxy() {
		Hello hello = new HelloImpl();
		DynamicProxy dynamicProxy = new DynamicProxy(hello);
		Hello helloProxy = dynamicProxy.getProxy(); 
		helloProxy.say("Jack");
	}

	private static void testStaticProxy() {
		Hello helloProxy = new HelloProxy();
		 helloProxy.say("Jack");
	}

}
