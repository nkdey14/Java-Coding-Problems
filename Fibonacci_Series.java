package logical_questions;

import java.util.Scanner;

public class Fibonacci_Series {
	
	static int n1 = 0, n2 = 1;
	
	public static void findFibonacci(int c) {
		
		if(c > 0) // 1 > 0
		{
			int n3 = n1 + n2; // n3 = 34
			
			n1 = n2; // n1 = 21
			
			n2 = n3; // n2 = 34
			
			System.out.print(" "+n3); // 1 2 3 5 8 13 21 34
			
			findFibonacci(c - 1); // 0
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the count: ");
		
		int count = sc.nextInt(); // 10
		
		System.out.print("Fibonacci Series: ");
		
		System.out.print(n1+" "+n2); // 0 1
		
		findFibonacci(count - 2); // 8
		
	}

}
