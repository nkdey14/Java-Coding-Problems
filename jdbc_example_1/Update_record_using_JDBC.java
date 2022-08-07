package jdbc_example_2;

import java.sql.*;

// JDBC code to update a given record

public class Update_record_using_JDBC {

	public static void main(String[] args) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","nitin");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("update employee set name='Sanjay', email='sanjay.nayak@ibm.com' where emp_id='1029'");
			
			con.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
}
