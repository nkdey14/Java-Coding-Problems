package jdbc_example_2;

import java.sql.*;
import java.util.Scanner;

// JDBC code to a delete record using Scanner class

public class Delete_a_record_using_JDBC {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Employee email address which you want to delete:");
			
			String emp_email = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","nitin");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("delete from employee where email='"+emp_email+"'");
			
			con.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
}
