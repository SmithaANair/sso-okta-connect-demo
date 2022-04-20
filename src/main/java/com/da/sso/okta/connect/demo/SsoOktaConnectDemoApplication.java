package com.da.sso.okta.connect.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class SsoOktaConnectDemoApplication extends WebSecurityConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(SsoOktaConnectDemoApplication.class, args);
	}
	
	@Override  
	public void configure(HttpSecurity http) throws Exception {  
	    http  
	        .authorizeRequests()  
	        .anyRequest().authenticated()
	        .and()  
            .oauth2Login();  
	}

}
