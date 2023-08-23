package com.ap.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
	public void greet() {
		System.out.println("Java based with annotation config");
	}
}
