package org.smart4j.smartweb.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.smart4j.framework.annotation.Service;
import org.smart4j.framework.annotation.Transaction;
import org.smart4j.framework.helper.DatabaseHelper;
import org.smart4j.smartweb.model.Customer;

@Service
public class CustomerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

	public List<Customer> getCustomerList() {
		String sql = "select * from customer";
		return DatabaseHelper.queryEntityList(Customer.class, sql);
	}

	public Customer getCustomer(long id) {
		String sql = "select * from customer where id = " + id;
		return DatabaseHelper.queryEntity(Customer.class, sql);
	}

	@Transaction
	public boolean createCustomer(Map<String, Object> fieldMap) {
		return DatabaseHelper.insertEntity(Customer.class, fieldMap);
	}

	@Transaction
	public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
		return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
	}

	@Transaction
	public boolean deleteCustomer(long id) {
		return DatabaseHelper.deleteEntity(Customer.class, id);
	}

}
