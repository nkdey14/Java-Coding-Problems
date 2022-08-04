package app_java_regex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name_Validation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		
		String str = sc.nextLine();
		
		Pattern p = Pattern.compile("[^a-zA-Z\\s]");
		
		Matcher m = p.matcher(str);
		
		int count = 0;
		
		while(m.find()) {
			
			count++;
		}	
		if(count != 0 || str.length() < 3)
		{
			System.out.println("Error!");
		}
		else
		{
			System.out.println("Input Accepted");
		}
	}
}
