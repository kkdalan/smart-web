package org.smart4j.smartweb.ws.sopa_jaxws;

import javax.jws.WebService;

@WebService
public interface HelloService {

	public String say(String name);
}
