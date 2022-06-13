package lab11;
import java.sql.*;
public class Jdbc_practice {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","o123a567");
			
			Statement smt= con.createStatement();
			
			smt.executeUpdate("CREATE DATABASE emp");
			System.out.println("Database created.....");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
