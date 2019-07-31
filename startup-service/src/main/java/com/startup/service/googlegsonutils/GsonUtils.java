package com.startup.service.googlegsonutils;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.startup.service.mobile.Details;
@Component
public class GsonUtils {
	public Details getDetails(String jsonString) {
		GsonBuilder builder = new GsonBuilder(); 
	      builder.setPrettyPrinting(); 
	      
	      Gson gson = builder.create(); 
	      return gson.fromJson(jsonString, Details.class); 
	}

}
