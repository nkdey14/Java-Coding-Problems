package app_java_strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String s = sc.nextLine();
		
		System.out.print("Reverse String is: ");
		
		// printing each character of the String in reverse order
		
		for(int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}

	}

}
