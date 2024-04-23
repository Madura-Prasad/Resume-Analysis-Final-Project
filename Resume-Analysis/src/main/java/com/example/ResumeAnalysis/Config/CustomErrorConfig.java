package com.example.ResumeAnalysis.Config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

@Configuration
public class CustomErrorConfig {
	
	  @Bean
	    ErrorPageRegistrar errorPageRegistrar() {
		        return registry -> {
		            registry.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404"));
		            registry.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN, "/404"));
		        };
		    }

}
