package org.smart4j.smartweb.rest;

import org.junit.Assert;
import org.junit.Test;
import org.smart4j.plugin.rest.RestHelper;
import org.smart4j.smartweb.model.Customer;
import org.smart4j.smartweb.rest.impl.CustomerRestServiceImpl;

public class CustomerRestServiceTest {

	@Test
	public void getCustomerTest() throws Exception {
		String wadl = "http://localhost:8080/smart-web/rest/CustomerRestServiceImpl";
		CustomerRestService customerRestService = RestHelper.createClient(wadl, CustomerRestServiceImpl.class);
		long id = 1;
		Customer customer = customerRestService.getCustomer(id);
		Assert.assertNotNull(customer);
	}

}
