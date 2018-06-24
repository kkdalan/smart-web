package org.smart4j.smartweb.soap.impl;

import org.smart4j.framework.annotation.Service;
import org.smart4j.plugin.soap.Soap;
import org.smart4j.smartweb.model.Customer;
import org.smart4j.smartweb.service.CustomerService;
import org.smart4j.smartweb.soap.CustomerSoapService;

@Soap
@Service
public class CustomerSoapServiceImpl implements CustomerSoapService{

	@Override
	public Customer getCustomer(long customerId) {
		CustomerService customerService = new CustomerService();
		return customerService.getCustomer(customerId);
	}

}
