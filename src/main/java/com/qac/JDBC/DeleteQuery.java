package com.qac.JDBC;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQuery {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/pradnya";
			String username = "root";
			String pass = "root";
			Connection connection=DriverManager.getConnection(url, username, pass);
			
			Statement statement =connection.createStatement();
			
			statement.execute("delete from familyinfo where id = 8;");
			
			connection.close();
			System.out.println("value deleted");
			
		} catch (ClassNotFoundException |SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
				}
	}

}
