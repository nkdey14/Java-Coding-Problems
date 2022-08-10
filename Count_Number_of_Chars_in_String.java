package app_java_regex1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count_Number_of_Chars_in_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String s = sc.nextLine();
		
	//	String s = "Pankaj";
		
		Pattern p = Pattern.compile("[a-zA-Z\\s]");
		
		Matcher m = p.matcher(s);
		
		int count = 0;
		
		while(m.find()) {
			
		//	System.out.print(m.group()+" ");
			
			count++;
		}
		
		System.out.println("Count of characters in "+ s + " is: "+ count);
	}
}
