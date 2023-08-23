package com.ap.test;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ap.ioc.bean.HelloBean;
import com.ap.ioc.config.MyNewConfig;

public class HelloTest {
	@Test
	void demo() {
		try (var context = new AnnotationConfigApplicationContext(MyNewConfig.class)) {

			var bean = context.getBean(HelloBean.class);
			bean.greet();  
			
			var date = context.getBean(Date.class);
			System.out.println(date);

		}

	}
}
