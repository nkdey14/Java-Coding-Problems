package app_jdbc_1;

import java.sql.*;
import java.util.Scanner;

// Update record using JDBC code

public class Update_Record {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the name what you want to update:");
			String name = sc.next();
			
			System.out.println("Enter the city what you want to update:");
			String city = sc.next();
			
			System.out.println("Enter the roll_no where you want to update the record:");
			String roll_no = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","nitin");
			
			Statement stmt = con.createStatement();
			
		//	stmt.executeUpdate("update Student set name = 'Sravan', city = 'Chitoor' where roll_no = '02'");
			
			stmt.executeUpdate("update Student set name = '"+name+"', city = '"+city+"' where roll_no = '"+roll_no+"'");
			
			con.close();
		
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
}
