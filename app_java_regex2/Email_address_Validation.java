package app_java_regex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_address_Validation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your email address: ");
		
		String str = sc.next();
		
		Pattern p = Pattern.compile("[^a-z0-9@.]");
		
		Matcher m = p.matcher(str);
		
		int count = 0;
		
		while(m.find()) {
			
			count++;
		}
		
		if(count != 0 || str.length() <= 12)
		{
			System.out.println("Error!");
		}
		else
		{
			System.out.println("Input Accepted");
		}
	}
}
