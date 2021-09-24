package com.demo;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	 public class JdbcDemo {
	   static final String DB_URL = "jdbc:mysql:/yug";
	   static final String USER = "root";
	   static final String PASS = "yugal@123";

	  public static void main(String[] args) {
	      // Open a connection
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {              
	         String sql = "CREATE DATABASE STUDENTS";
	         stmt.executeUpdate(sql);
	         System.out.println("Database created successfully...");         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}


