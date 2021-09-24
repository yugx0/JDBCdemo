package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Demo {
	public static void main(String ar[]) {


		 Connection connection = null;
		final String username = "root";
		final String password = "yugal@123";
		final String jdbcurl = "jdbc:mysql:/yug";
		String selectsql = "";
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); for ms server


		 // String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
		// String user = "sa";
		// String pass = "";


		 try {


		 Class.forName("com.mysql.cj.jdbc.Driver"); ///


		 connection = DriverManager.getConnection(jdbcurl,username,password);///authentication
		Statement statement = connection.createStatement();
		System.out.println("connected...");
		//create table
		 //String sql="CREATE TABLE customer"+"(id INTEGER not null,"+"age VARCHAR(222),"+"address VARCHAR(255),"
		 //+" SALARY INTEGER,"+"PRIMARY KEY(ID))";
		 //statement.executeUpdate(sql);
		 //System.out.println("table created");
		
		// //Insert into table
		// String insert="Insert into customer VALUES(1,'23','California',563)";
		 //insert = "INSERT INTO customer VALUES (2, '24', 'Lasvegas', 252.3)";
		 //insert = "INSERT INTO customer VALUES (4, '45', 'karnal', 322.3)";
		 //statement.executeUpdate(insert);
		 //System.out.println("Yahooooo");
		//
		//update
		String update ="Update customer Set address='Bhootbangla' where id=4";
		statement.execute(update);
		System.out.println("bole toh updte ");
		
		//show VIEW
		selectsql = "select * from CUSTOMER ";
		ResultSet rs=statement.executeQuery(selectsql);
		while(rs.next())
		{
		System.out.print("ID is: " + rs.getInt("id"));
		System.out.println("age is: " + rs.getString("age"));
		System.out.println("addres: is " + rs.getString("address"));
		System.out.println("salary is : " + rs.getString("salary"));
		}

		 } catch (Exception e) {
		e.printStackTrace();


		 }


		 }


		}


