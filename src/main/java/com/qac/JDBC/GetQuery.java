package com.qac.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class GetQuery {
	public static void main(String[] args) {
		
		//1.load the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		//2.get connection
			String url = "jdbc:mysql://localhost:3306/pradnya";
			String username = "root";
			String pass = "root";
			
			Connection connection = DriverManager.getConnection(url, username, pass);
			
		//3.create statement
			Statement statement = connection.createStatement();
			
		//4.execute query
			ResultSet rs = statement.executeQuery("Select * from familyinfo");
			while(rs.next())
				System.out.println("id :" + rs.getInt(1)+ "  name :" + rs.getString(2)+"  age :"+rs.getInt(3)+"  email :"+rs.getString(4));
			
		//5.close connection
			connection.close();
			
		} catch (ClassNotFoundException|SQLException e) { 
			e.printStackTrace();
		} 
		}
	}


