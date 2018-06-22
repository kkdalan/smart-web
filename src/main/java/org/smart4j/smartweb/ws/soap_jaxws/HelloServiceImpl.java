package org.smart4j.smartweb.ws.soap_jaxws;

import javax.jws.WebService;

import org.smart4j.smartweb.ws.soap_jaxws.HelloService;
import org.springframework.stereotype.Component;

@WebService
@Component
public class HelloServiceImpl implements HelloService {

	@Override
	public String say(String name) {
		return "Hello " + name;
	}

}
