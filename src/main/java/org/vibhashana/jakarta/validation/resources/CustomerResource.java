package org.vibhashana.jakarta.validation.resources;

import org.vibhashana.jakarta.validation.models.Customer;

import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;

@Path("/customers")
public class CustomerResource {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String addCustomer(@Valid Customer customer) {
		return "Valid Customer";
	}
}
