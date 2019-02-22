package com.restannotation.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("test")
public class TestController {

	@POST()
	@Test
	@Produces("application/text")
	public Response post() {
		return Response.ok("Yep").build();
	}
	
	@GET()
	@Produces("application/text")
	public Response get() {
		return Response.ok("Yep").build();
	}

}
