package logical_questions;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt(); // 345
		
		int num = n; // 345
		
		int rev = 0; 
		
		while(n != 0) // 0 != 0
		{
			int rem = n % 10; // rem = 3
			
			rev = rev * 10 + rem; // rev = 543
			
			n = n / 10; // n = 0
		}
		
		System.out.println("Reverse number is: "+rev); // 543
		
		if(num == rev)
		{
			System.out.println(num + " is palindrome");
		}
		else
		{
			System.out.println(num + " is not palindrome");
		}

	}

}
