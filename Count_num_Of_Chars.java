package app_java_Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count_num_Of_Chars {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String s = sc.nextLine();
		
		Pattern p = Pattern.compile("\\S");
		
		Matcher m = p.matcher(s);
		
		int count = 0;
		
		while(m.find()) {
			
			count++;
		}
		
		System.out.println("Count of characters in "+ s + " is "+ count);
	}
}
