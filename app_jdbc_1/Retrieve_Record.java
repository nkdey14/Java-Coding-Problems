package app_jdbc_1;

import java.sql.*;

// Retrieve records using JDBC code

public class Retrieve_Record {

	public static void main(String[] args) {
		
		try {
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","nitin");
			
			Statement stmt = con.createStatement();
			
			ResultSet res = stmt.executeQuery("select * from Student");
			
			while(res.next()) {
				
//				System.out.println(res.getString(1));
//				System.out.println(res.getString(2));
//				System.out.println(res.getString(3));
//				System.out.println(res.getString(4));
//				System.out.println(res.getString(5));
				
				System.out.println(res.getString(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4)+"\t"+res.getString(5));
			}
			
			con.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
}
