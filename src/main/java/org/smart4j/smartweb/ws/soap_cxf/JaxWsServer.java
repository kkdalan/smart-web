package org.smart4j.smartweb.ws.soap_cxf;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.smart4j.smartweb.ws.soap_jaxws.HelloService;
import org.smart4j.smartweb.ws.soap_jaxws.HelloServiceImpl;

public class JaxWsServer {

	public static void main(String[] args) {
		JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
		factory.setAddress("http://localhost:8080/smart-web/ws/soap/hello");
		factory.setServiceClass(HelloService.class);
		factory.setServiceBean(new HelloServiceImpl());
		factory.create();
		System.out.println("soap ws is published");
	}
}
