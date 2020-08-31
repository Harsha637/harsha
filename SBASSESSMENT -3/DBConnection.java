package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	 public static Connection getconnection()
	 {
		 
		 try{
			 Class.forName("oracle.jdbc.OracleDriver");
			 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "dxcfs","pass");
			 return con;
			 }
			 catch (Exception e) {
			 e.printStackTrace();
			 return null;
			 }
			 }
	 }


