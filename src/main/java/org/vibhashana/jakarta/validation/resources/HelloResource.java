package org.vibhashana.jakarta.validation.resources;

import jakarta.validation.constraints.PositiveOrZero;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response sayHello() {
		return Response.status(Response.Status.OK).entity("Hello World").build();
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/sqrt/{value}")
	public Response calculate(@PathParam("value") @PositiveOrZero Double value) {
		return Response.status(Response.Status.OK).entity("SQRT = " + Math.sqrt(value)).build();
	}
}
