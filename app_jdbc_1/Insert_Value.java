package app_jdbc_1;

import java.sql.*;
import java.util.Scanner;

// Insert values using JDBC code

public class Insert_Value {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Student's roll_no.:");
			String roll_no = sc.next();
			
			System.out.println("Enter Student's name:");
			String name = sc.next();
			
			System.out.println("Enter Student's class:");
			String cls = sc.next();
			
			System.out.println("Enter Student's sec:");
			String sec = sc.next();
			
			System.out.println("Enter Student's city:");
			String city = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_2","root","nitin");
			
			Statement stmt = con.createStatement();
			
	//		stmt.executeUpdate("insert into Student values ('01','Nitin','MCA','B','Balasore')");
			
			stmt.executeUpdate("insert into Student values ('"+roll_no+"','"+name+"','"+cls+"','"+sec+"','"+city+"')");
			
			con.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
}
