package logical_questions;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: "); 
		
		int n1 = sc.nextInt(); // 22
		
		System.out.println("Enter the second number: ");
		
		int n2 = sc.nextInt(); // 30
		
		while(n1 != n2) // 2 != 2
		{
			if(n1 > n2) 
			{
				n1 = n1 - n2; // n1 = 2
			}
			else
			{
				n2 = n2 - n1; // n2 = 2
			}
		}
		
		System.out.println("GCD = "+n2); // 2

	}

}
