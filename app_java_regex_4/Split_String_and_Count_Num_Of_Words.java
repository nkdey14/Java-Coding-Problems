package app_java_regex5;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Split_String_and_Count_Num_Of_Words {

	
	public static void main(String[] args) {
		
		// Approach - 1 (Using String)
		
	/*	String s = " Pankaj Sir Academy ";
		
		String[] str = s.trim().split(" ");
		
		for(String i: str)
		{
			System.out.println(i);
		}
		
		System.out.println("Word count: "+ str.length);
		
	*/
		
		// Approach - 2 (Using StringTokenizer)
		
	/*	StringTokenizer str = new StringTokenizer("Pankaj Sir Academy");
		
		int count = 0;
		
		while(str.hasMoreTokens()) {
			
			System.out.println(str.nextToken());
			
			count++;
		}
		
		System.out.println("Word count: "+ count);
		
	*/
		
	//	Approach - 3 (Using RegularExpression)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = sc.nextLine();
		
		Pattern p = Pattern.compile(" ");
		
		String[] s = p.split(str);
		
		for(String i : s)
		{
			System.out.println(i);
		}
		
		System.out.println("Word count: "+ s.length);
	}
}
