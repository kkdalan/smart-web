package org.smart4j.smartweb.proxy.impl;

import org.smart4j.smartweb.proxy.Hello;

public class HelloProxy implements Hello {

	private Hello hello;
	
	public HelloProxy() {
		hello = new HelloImpl();
	}
	
	@Override
	public void sayHello(String name) {
		before();
		System.out.println("Hello! " + name);
		after();
	}

	private void after() {
		System.out.println("After");
	}

	private void before() {
		System.out.println("Before");
	}

}
