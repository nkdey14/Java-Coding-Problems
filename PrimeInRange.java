package logical_questions;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		
		int n1 = sc.nextInt(); // 1
		
		System.out.println("Enter the last number: ");
		
		int n2 = sc.nextInt(); // 50
		
		System.out.print("Prime numbers between "+ n1 + " and " + n2 + " are: ");
		
		while(n1 < n2) // 7 < 50 
		{
			int flag = 0;
			
			for(int i=2; i<n1; i++) // i = 6, 6 < 7
			{
				if(n1 % i == 0) // 7 % 6 != 0
				{
					flag = 1;
					
					break;
				}
			}
			
			if(n1 > 1 && flag == 0)
			{
				System.out.print(n1+" "); // 2 3 5 7
			}
			
			n1++;
		}

	}

}
