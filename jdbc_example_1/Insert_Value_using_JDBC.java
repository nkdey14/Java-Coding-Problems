package jdbc_example_2;

import java.sql.*;
import java.util.Scanner;

// JDBC code to insert value using Scanner class

public class Insert_Value_using_JDBC {

	public static void main(String[] args) {
		
		try {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Employee_ID:");
			String emp_id = sc.next();
			
			System.out.println("Enter Employee name:");
			String emp_name = sc.next();
			
			System.out.println("Enter Employee's mobile number:");
			String emp_mob = sc.next();
			
			System.out.println("Enter Employee's email address:");
			String emp_email = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_1","root","nitin");
			
			Statement stmt = con.createStatement();
			
			stmt.executeUpdate("insert into employee values('"+emp_id+"','"+emp_name+"','"+emp_mob+"','"+emp_email+"')");
			
			con.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
}
