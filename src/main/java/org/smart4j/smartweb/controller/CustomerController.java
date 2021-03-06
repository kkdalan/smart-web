package org.smart4j.smartweb.controller;

import java.util.List;
import java.util.Map;

import org.smart4j.framework.annotation.Action;
import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.bean.Data;
import org.smart4j.framework.bean.FileParam;
import org.smart4j.framework.bean.Param;
import org.smart4j.framework.bean.View;
import org.smart4j.smartweb.model.Customer;
import org.smart4j.smartweb.service.CustomerService;

@Controller
public class CustomerController {

	@Inject
	private CustomerService customerService;

	@Action("get:/customer")
	public View index() {
		List<Customer> customerList = customerService.getCustomerList();
		return new View("customer.jsp").addModel("customerList", customerList);
	}

	@Action("get:/customer_show")
	public View show(Param param) {
		long id = param.getLong("id");
		Customer customer = customerService.getCustomer(id);
		return new View("customer_show.jsp").addModel("customer", customer);
	}

	@Action("get:/customer_create")
	public View create() {
		return new View("customer_create.jsp");
	}

	@Action("post:/customer_create")
	public Data createSubmit(Param param) {
		Map<String, Object> fieldMap = param.getFieldMap();
		FileParam fileParam = param.getFile("photo");
		fieldMap.remove("photo");
		boolean result = customerService.createCustomer(fieldMap, fileParam);
		return new Data(result);
	}

	@Action("get:/customer_edit")
	public View edit(Param param) {
		long id = param.getLong("id");
		Customer customer = customerService.getCustomer(id);
		return new View("customer_edit.jsp").addModel("customer", customer);
	}

	@Action("post:/customer_edit")
	public Data editSubmit(Param param) {
		long id = param.getLong("id");
		Map<String, Object> fieldMap = param.getFieldMap();
		FileParam fileParam = param.getFile("photo");
		fieldMap.remove("photo");
		boolean result = customerService.updateCustomer(id, fieldMap, fileParam);
		return new Data(result);
	}

	@Action("get:/customer_delete")
	public View delete(Param param) {
		long id = param.getLong("id");
		Customer customer = customerService.getCustomer(id);
		return new View("customer_delete.jsp").addModel("customer", customer);
	}
	
	@Action("post:/customer_delete")
	public Data deleteSubmit(Param param) {
		long id = param.getLong("id");
		boolean result = customerService.deleteCustomer(id);
		return new Data(result);
	}

}
