package com.global.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	public Connection getConnection(){
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mariadb://localhost:3306/LMS?useUnicode=true&characterEncoding=UTF-8","root","admin");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
