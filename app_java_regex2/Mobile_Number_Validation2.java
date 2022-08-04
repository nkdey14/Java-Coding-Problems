package app_java_regex2;

import java.util.Scanner;

public class Mobile_Number_Validation2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your mobile number: ");
		
		String str = sc.next();
		
		String regex = "[6-9][0-9]{9}";
		
		if(str.matches(regex)) {
			
			System.out.println("Valid Number");
		}
		else
		{
			System.out.println("Invalid Number!");
		}
	}
}
