package app_java_regex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mobile_Number_Validation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your mobile no. :");
		
		String str = sc.next();
		
		Pattern p = Pattern.compile("[^0-9]");
		
		Matcher m = p.matcher(str);
		
		int count = 0;
		
		while(m.find())
		{
			count++;
		}
		
		if(count != 0 || str.length() > 10 || str.length() < 10)
		{
			System.out.println("Error!");
		}
		else
		{
			System.out.println("Input accepted");
		}
	}
}
