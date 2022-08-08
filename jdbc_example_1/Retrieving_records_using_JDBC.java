package jdbc_example_2;

import java.sql.*;

// Retrieving records using JDBC code

public class Retrieving_records_using_JDBC {

	public static void main(String[] args) {
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","nitin");
			
			Statement stmt = con.createStatement();
			
			ResultSet res = stmt.executeQuery("Select * from employee");
			
			while(res.next()) {
				
//				System.out.println(res.getString(1));
//				System.out.println(res.getString(2));
//				System.out.println(res.getString(3));
//				System.out.println(res.getString(4));
				
				System.out.println(res.getString(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
			}
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
}
