package lab11;

import java.sql.*;
public class Program1 {
	public static void main(String[] args) {
		try {
		//database credentials
			final String DB_URL= "jdbc:mysql://localhost:3306/aiml";
			final String USER= "root";
			final String PASS = "o123a567";
			
		// 2- load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// 3- make the connection
			Connection con= DriverManager.getConnection(DB_URL, USER, PASS);
			
		// 4- prepare statements
			Statement smt= con.createStatement();
			
		// 5- execute the statement 
			ResultSet rs= smt.executeQuery("select * from emp");
		//6- (Optional) print the statement
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));}
		}catch (Exception e) {
			System.out.print(e);
		}
	}
}
