package org.smart4j.smartweb.ws.soap_cxf;

import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.smart4j.smartweb.ws.soap_jaxws.HelloService;

public class SimpleClient {

	public static void main(String[] args) {
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setAddress("http://localhost:8080/smart-web/ws/soap/hello");
		factory.setServiceClass(HelloService.class);
		
		HelloService helloService = factory.create(HelloService.class);
		String result = helloService.say("world");
		System.out.println(result);

	}
}
