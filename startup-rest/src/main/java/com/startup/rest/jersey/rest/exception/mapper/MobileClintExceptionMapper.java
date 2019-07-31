package com.startup.rest.jersey.rest.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.web.client.HttpClientErrorException;

import com.startup.customexceptions.ErrorMessages;
@Provider
public class MobileClintExceptionMapper implements ExceptionMapper<HttpClientErrorException> {

	@Override
	public Response toResponse(HttpClientErrorException exception) {
		ErrorMessages errorMessage=new ErrorMessages(exception.getMessage(), Status.BAD_REQUEST.getStatusCode());
		return Response.status(Status.BAD_REQUEST).entity(errorMessage).build();
	}

}
