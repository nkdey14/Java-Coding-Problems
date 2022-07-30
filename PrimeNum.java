package logical_questions;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();  // taking number as input from the user
		
		int flag = 0;
		
		for(int i=2; i<n; i++) // i = 4, 4 < 5
		{
			if(n % i == 0) // 5 % 4 != 0
			{
				flag = 1; 
				
				break;
			}
		}
		
		if(n > 1 && flag == 0)
		{
			System.out.println(n + " is a prime number");
		}
		else
		{
			System.out.println(n + " is not a prime number");
		}

	}

}
