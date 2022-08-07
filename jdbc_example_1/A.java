package jdbc_example_1;

import java.sql.*;

public class A {

	public static void main(String[] args) {
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","nitin");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("insert into employee values('1022','Nitin','8338042937','nitin.dey@ibm.com')");
			
		//	stmt.executeUpdate ("insert into employee values('1023','Fayzan','9937865467','fayzan.md@ibm.com')");
			
		//	stmt.executeUpdate ("delete from employee where emp_id='1022'");
			
			con.close();
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
}
