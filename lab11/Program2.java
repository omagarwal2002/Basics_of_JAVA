package lab11;
import java.sql.*;
public class Program2 {
	public static void main(String[] args) {
		try {
		//database credentials
			final String DB_URL= "jdbc:mysql://localhost:3306/";
			final String USER= "root";
			final String PASS = "o123a567";
			
		// 2- load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// 3- make the connection
			Connection con= DriverManager.getConnection(DB_URL, USER, PASS);
			
		// 4- prepare statements
			Statement smt= con.createStatement();
			
		// 5- execute the statement 
		// String DB_NAME= "AIMLB13"
			String sql= "CREATE DATABASE aiml2";
			smt.executeUpdate(sql);
		//con.close
			System.out.println("Database Created Successfully...");
		}catch (Exception e) {
			System.out.print(e);
		}
	}

}
