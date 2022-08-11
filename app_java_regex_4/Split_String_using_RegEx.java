package app_java_regEx;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Split_String_using_RegEx {

	public static void main(String[] args) {
		
		String s = "Pankaj Sir Academy";
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter a String: ");
//		
//		String s = sc.nextLine();
		
		Pattern p = Pattern.compile("\\s");
		
		String[] str = p.split(s);
		
		int count = 0;
		
		for(String i: str)
		{
			System.out.println(i);
			
			count++;
		}
		
		System.out.println("Count: "+ count);
	}
}
