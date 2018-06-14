package org.smart4j.smartweb.proxy.impl;

import org.smart4j.smartweb.proxy.Hello;

public class HelloImpl implements Hello {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello! " + name);
	}

}
