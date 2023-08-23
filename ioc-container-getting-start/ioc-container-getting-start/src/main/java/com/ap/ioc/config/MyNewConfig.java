package com.ap.ioc.config;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan(basePackages = "com.ap.ioc.bean")
public class MyNewConfig {
	
	@Bean
	Date date() {
		return new Date();
	}
}
