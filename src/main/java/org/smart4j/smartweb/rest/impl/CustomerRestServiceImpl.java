package org.smart4j.smartweb.rest.impl;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.annotation.Service;
import org.smart4j.plugin.rest.Rest;
import org.smart4j.smartweb.model.Customer;
import org.smart4j.smartweb.rest.CustomerRestService;
import org.smart4j.smartweb.service.CustomerService;


@Rest
@Service
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CustomerRestServiceImpl implements CustomerRestService {

	@Override
	@GET
	@Path("/customer/{id}")
	public Customer getCustomer(@PathParam("id") long customerId) {
		CustomerService customerService = new CustomerService();
		return customerService.getCustomer(customerId);
	}

}
