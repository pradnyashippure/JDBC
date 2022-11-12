package com.qac.JDBC;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateQuery {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/pradnya";
		String username = "root";
		String pass = "root";
		Connection connection=DriverManager.getConnection(url, username, pass);
		
		Statement statement =connection.createStatement();
		
        statement.execute("update familyinfo set name ='Kartik' where id = 7;");
        statement.execute("update familyinfo set email ='karu22@gmail.com' where id = 7;");
        statement.execute("update familyinfo set age=24 where id = 7;");
        
		System.out.println("value updated");
		
		connection.close();
		
	} catch (ClassNotFoundException |SQLException e) { 
		// TODO Auto-generated catch block
		e.printStackTrace();
			}
	}

}
