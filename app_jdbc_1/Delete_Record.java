package app_jdbc_1;

import java.sql.*;
import java.util.Scanner;

// Delete record using JDBC code

public class Delete_Record {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Student's city which you want to delete:");
			
			String city = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","nitin");
			
			Statement stmt = con.createStatement();
			
		//	stmt.executeUpdate("delete from Student where city = 'Dehradun'");
			
			stmt.executeUpdate("delete from Student where city = '"+city+"'");
			
			con.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
}
