package com.startup.rest.jersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.startup.rest.user.UserResource;
@Configuration
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		packages("com.startup");
		register(UserResource.class);
		//register(UserResource.class);
		
	}



}
