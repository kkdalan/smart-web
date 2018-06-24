package org.smart4j.smartweb.soap;

import org.junit.Assert;
import org.junit.Test;
import org.smart4j.plugin.soap.SoapHelper;
import org.smart4j.smartweb.model.Customer;

public class CustomerSoapServiceTest {

	@Test
	public void getCustomerTest() throws Exception {
		String wsdl = "http://localhost:8080/smart-web/soap/CustomerSoapService";
		CustomerSoapService customerSoapService = SoapHelper.createClient(wsdl, CustomerSoapService.class);
		long id = 1;
		Customer customer = customerSoapService.getCustomer(id);
		Assert.assertNotNull(customer);
	}

}
