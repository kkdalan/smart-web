package org.smart4j.smartweb.ws.soap_cxf;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.smart4j.smartweb.ws.soap_jaxws.HelloService;
import org.smart4j.smartweb.ws.soap_jaxws.HelloServiceImpl;

public class SimpleServer {

	public static void main(String[] args) {
		ServerFactoryBean factory = new ServerFactoryBean();
		factory.setAddress("http://localhost:8080/smart-web/ws/soap/hello");
		factory.setServiceClass(HelloService.class);
		factory.setServiceBean(new HelloServiceImpl());
		factory.create();
		System.out.println("soap ws is published");
	}
}
