package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTableDemo {
	public static void main(String args[]) {
		Connection connection = null;
		final String username = "root";
		final String password = "yugal@123";
		final String jdbcurl = "jdbc:mysql:/yug";
		
		  String selectsql = "";
	        // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); for ms server

		  	// String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
	        // String user = "sa";
	        // String pass = "";

		  	try {
		  		Class.forName("com.mysql.cj.jdbc.Driver"); 
	            connection = DriverManager.getConnection(jdbcurl, username, password);/// authentication
	            Statement statement = connection.createStatement();// this used for creating sql statement

	            String sql = "CREATE TABLE emp130 " + "(id INTEGER not NULL, " + " name VARCHAR(255), " + "  "
	                   + " salary INTEGER, " + " PRIMARY KEY ( id ))";
	            
	            statement.executeUpdate(sql);//this one
		  	

	          // String procedurevar=" create or replace procedure \"INSERTR\"  \r\n"
	             //
	            		//+ "                   (id IN NUMBER,name IN VARCHAR2)  \r\n"
	                    //+ "                is  \r\n"
	                    //+ "                   begin  \r\n"
	                    //+ "                       insert into user420 values(id,name);  \r\n"
	                   // + "               end;  \r\n"
	                    //+ "                /";
	                    
	                    
	            
	            
	             String insert = "INSERT INTO CUSTOMER VALUES (2,'32','Ahmedabad',2000);";
	              statement.executeUpdate(insert);
	             
	            
	           
	            
	           // statement.executeUpdate(procedurevar);//this one
	            
	            System.out.println("done...");

	  } 
		  	catch (Exception e) {
	            e.printStackTrace();
		  		}
				}

	 }


