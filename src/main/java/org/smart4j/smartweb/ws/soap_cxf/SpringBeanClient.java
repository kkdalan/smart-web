package org.smart4j.smartweb.ws.soap_cxf;

import org.smart4j.smartweb.ws.soap_jaxws.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanClient {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");

		HelloService helloService = context.getBean("helloService", HelloService.class);
		String result = helloService.say("world");
		System.out.println(result);

	}
}
