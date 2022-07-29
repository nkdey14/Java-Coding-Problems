package app_java_strings;

import java.util.Scanner;

public class StringReverse2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String s = sc.nextLine();
		
		String rev = new StringBuilder(s).reverse().toString();
		
		System.out.println("Reverse String: "+rev);

	}

}
