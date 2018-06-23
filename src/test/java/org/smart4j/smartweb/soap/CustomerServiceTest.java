package org.smart4j.smartweb.soap;

import org.junit.Assert;
import org.junit.Test;
import org.smart4j.plugin.soap.SoapHelper;
import org.smart4j.smartweb.model.Customer;

public class CustomerServiceTest {

	@Test
	public void getCustomerTest() throws Exception {
		String wsdl = "http://localhost:8080/smart-web/soap/CustomerService";
		CustomerService customerService = SoapHelper.createClient(wsdl, CustomerService.class);
		long id = 1;
		Customer customer = customerService.getCustomer(id);
		Assert.assertNotNull(customer);
	}

}
