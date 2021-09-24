package com.demo;

import java.sql.*;
import java.io.*;

public class PreparedStatmentDemo {
	public static void main (String args[])throws Exception{
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql:/yug", "root", "yugal@123");

	 

	        PreparedStatement ps = con.prepareStatement("insert into emp130 values(?,?,?)");
	      
	        
	        //taking values from key boar using io streams
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 

	        do {
	            System.out.println("enter id:");
	            int id = Integer.parseInt(br.readLine());
	            System.out.println("enter name:");
	            String name = br.readLine();
	            System.out.println("enter salary:");
	            float salary = Float.parseFloat(br.readLine());

	 

	            ps.setInt(1, id);  //first col
	            ps.setString(2, name);//second col
	            ps.setFloat(3, salary);//third col
	            int i = ps.executeUpdate();
	            System.out.println(i + " records affected");

	 

	            System.out.println("Do you want to continue: y/n");
	            String s = br.readLine();
	            if (s.startsWith("n")) {
	                break;
	            }
	        } while (true);

	 

	        con.close();
	    }
	
	}


