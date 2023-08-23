package com.ap.maven;

import java.sql.DriverManager;

public class courseInsert {
private static final String PASS = "admin";
private static final String USER = "root";
private static final String URL = "jdbc:mysql://localhost:3306/hello_maven";
private static final String SQL = "insert into course (name, fees, duration) values (?, ?, ?)";

public void insert(Course c) {
	try (var conn = DriverManager.getConnection(URL, USER, PASS);
			var stmt = conn.prepareStatement(SQL)) {
		
		stmt.setString(1, c.getName());
		stmt.setInt(2, c.getFee());
		stmt.setInt(3, c.getDuration());
		
		stmt.executeUpdate();
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
