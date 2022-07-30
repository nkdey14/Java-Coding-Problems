package logical_questions;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt(); //236
		
		int num = n; // 236
		
		int sum = 0;
		
		while(n != 0) // 0 != 0
		{
			int rem = n % 10; // rem = 2
			
			sum = sum + rem; // sum = 11
			
			n = n / 10; // n = 0
		}
		
		System.out.println("Sum of digits of "+ num + " is "+sum); // 11

	}

}
