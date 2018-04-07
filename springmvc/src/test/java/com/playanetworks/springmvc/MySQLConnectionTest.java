package com.playanetworks.springmvc;

import java.sql.DriverManager;
import java.sql.Connection;
import org.junit.Test;

public class MySQLConnectionTest {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://mydbserver:3306/perftest?serverTimezone=UTC";
	private static final String USER = "mgchoo";
	private static final String PW = "mgchoo";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
