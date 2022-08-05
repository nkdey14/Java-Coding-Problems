package logical_questions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt(); // 5
		
		int fact = 1;
		
		for(int i=n; i>0; i--) // i = 1, 1 > 0
		{
			fact = fact * i; // fact = 120
		}

		System.out.println("Factorial of "+ n + " is "+ fact); //120
	}

}
