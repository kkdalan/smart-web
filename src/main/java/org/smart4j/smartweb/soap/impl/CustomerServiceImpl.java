package org.smart4j.smartweb.soap.impl;

import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.annotation.Service;
import org.smart4j.plugin.soap.Soap;
import org.smart4j.smartweb.model.Customer;
import org.smart4j.smartweb.soap.CustomerService;

@Soap
@Service
public class CustomerServiceImpl implements CustomerService{

	@Inject
	private CustomerService customerService = null;
	
	@Override
	public Customer getCustomer(long customerId) {
		return customerService.getCustomer(customerId);
	}

}
