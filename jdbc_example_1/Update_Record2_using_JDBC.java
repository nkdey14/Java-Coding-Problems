package jdbc_example_2;

import java.sql.*;
import java.util.Scanner;

//JDBC code to update record using Scanner class

public class Update_Record2_using_JDBC {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the name what you want to update:");
			String emp_name = sc.next();
			
			System.out.println("Enter the email what you want to update:");
			String emp_email = sc.next();
			
			System.out.println("Enter the Employee_ID where you want to update:");
			String emp_id = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","nitin");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("update employee set name='"+emp_name+"', email='"+emp_email+"' where emp_id='"+emp_id+"'");
			
			con.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}

	}

}
