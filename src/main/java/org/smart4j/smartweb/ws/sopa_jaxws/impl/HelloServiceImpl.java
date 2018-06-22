package org.smart4j.smartweb.ws.sopa_jaxws.impl;

import javax.jws.WebService;

import org.smart4j.smartweb.ws.sopa_jaxws.HelloService;

@WebService(serviceName = "HelloService", portName = "HelloServicePort", endpointInterface = "org.smart4j.smartweb.ws.sopa_jaxws.HelloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String say(String name) {
		return "Hello " + name;
	}

}
