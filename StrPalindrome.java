package app_java_strings;

import java.util.Scanner;

public class StrPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String s = sc.nextLine();
		
		String rev ="";
		
		// printing each character of the String in reverse order
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		System.out.println("Reverse String is: "+ rev);
		
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println(s+" is palindrome");
		}
		else
		{
			System.out.println(s+" is not palindrome");
		}
	}

}
