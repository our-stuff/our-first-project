package com.startup.rest.main;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.startup")
@ComponentScan(basePackages = "com.startup")
@EntityScan("com.startup.*")
public class MainRunner extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder builder) {
        return builder;
    }

    public static void main (String[] args) {
        ApplicationContext ctx = SpringApplication.run(MainRunner.class, args);
        String[] beanNames = ctx.getBeanDefinitionNames();
        
        Arrays.sort(beanNames);
 
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
