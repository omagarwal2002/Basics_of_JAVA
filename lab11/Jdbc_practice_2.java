package lab11;
import java.sql.*;

public class Jdbc_practice_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","o123a567");
		
		Statement smt = con.createStatement();
		
		 String sqlTable = "CREATE TABLE emp1" +
                 "(id INTEGER not NULL, " +
                 " first VARCHAR(255), " + 
                 " last VARCHAR(255), " + 
                 " age INTEGER, " + 
                 " PRIMARY KEY ( id ))"; 
		 
		smt.executeUpdate(sqlTable);
	//	String ins="insert into emp1(id, 'first', 'last', age) values (12, 'om', 'agarwal', 20)";
		String ins2= "insert into emp1(id, first, last, age) values (99, 'sachin','kumar', 50)";
		
		smt.executeUpdate(ins2);
		
		ResultSet rs= smt.executeQuery("select * from emp1");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"     "+rs.getString(2)+"     "+rs.getString(3)+"     "+rs.getInt(4));
		}
		con.close();

	}

}
