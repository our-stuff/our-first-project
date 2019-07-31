package com.startup.rest.jersey.rest.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.startup.customexceptions.ErrorMessages;
import com.startup.customexceptions.MobileException;
@Provider
@Component
public class MobileExceptionMapper implements ExceptionMapper<MobileException> {

	@Value("${mobileErrorMessage}")
	private String mobileErrorMessage;
	
	@Override
	public Response toResponse(MobileException exception) {
		ErrorMessages errorMessage=new ErrorMessages(mobileErrorMessage, Status.BAD_REQUEST.getStatusCode());
		return Response.status(Status.BAD_REQUEST).entity(errorMessage).build();
	}

}
