package lab11;
import java.sql.*;
public class Program3 {
	
	public static void main(String[] args) {
		try {
		//database credentials
			final String DB_URL= "jdbc:mysql://localhost:3306/aiml1";
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
		//String sql = "CREATE DATABASE aiml1";
			 String sqlTable = "CREATE TABLE STUDENT" +
	                   "(id INTEGER not NULL, " +
	                   " first VARCHAR(255), " + 
	                   " last VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 

		 	int status= smt.executeUpdate(sqlTable);
		 	
		// doing new insertion
			
		     String sqlInsert = "insert into STUDENT(id, first, last, age) values (99, 'sachin','kumar', 50), (23, 'naman','agarwal', 25)";
		      
		      
		      status= smt.executeUpdate(sqlInsert);
		      System.out.println("Inserted records into the table...");


		      ResultSet rs= smt.executeQuery("select * from STUDENT");
		      
		 // optional - print the response
		      while(rs.next()) {
		    	  System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3)+" | "+rs.getInt(4));
		      }
			
		}catch (Exception e) {
			System.out.print(e);
		}
	}

}
