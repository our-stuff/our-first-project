package com.startup.rest.user;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.startup.request.user.UserRequestDto;
import com.startup.response.user.UserResponseDto;
import com.startup.service.user.UserService;

@Component
@Path("/v1/user")
public class UserResource {
	
	@Autowired
	private UserService userService; 
	
	@POST
	@Path("/userverify")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public UserResponseDto show(UserRequestDto userRequestDto ) {
		 
		UserResponseDto userResponseDto=userService.register(userRequestDto);
		
		return userResponseDto;
		
	}
	
}
