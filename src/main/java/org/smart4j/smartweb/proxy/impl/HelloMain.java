package org.smart4j.smartweb.proxy.impl;

import org.smart4j.smartweb.proxy.Hello;

public class HelloMain {

	public static void main(String[] args) {
		Hello hello = new HelloImpl();
		DynamicProxy dynamicProxy = new DynamicProxy(hello);
		Hello helloProxy = dynamicProxy.getProxy(); 
		helloProxy.say("Jack");
	}

}
