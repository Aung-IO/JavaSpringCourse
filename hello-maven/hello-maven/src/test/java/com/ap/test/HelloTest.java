package com.ap.test;

import org.junit.jupiter.api.Test;

import com.ap.maven.Course;
import com.ap.maven.courseInsert;

public class HelloTest {
	@Test
	void test() {
		var c = new Course();
		c.setName("Full Stack Spring");
		c.setFee(200000);
		c.setDuration(4);

		var insert = new courseInsert();
		insert.insert(c);

	}
}
