package com.startup.rest.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
@Bean
public RestTemplate RestTemplate() {
	return new RestTemplate();
}
}
