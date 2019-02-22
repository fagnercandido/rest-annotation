package com.restannotation.controller;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
@Test
public class SomeRequestFilter implements ContainerRequestFilter {

	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("Pass Here");
	}

}