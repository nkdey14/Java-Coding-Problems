package log_p3;

import java.util.Scanner;

public class Swap_Values_without_using_Third_variable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		
		int num1 = sc.nextInt(); // 10
		
		System.out.println("Enter the second number:");
		
		int num2 = sc.nextInt(); // 20
		
		System.out.println("Before swapping values are: "+ num1 + " and "+ num2);
		
		// swapping
		
		num1 = num1 + num2; // 30
		
		num2 = num1 - num2; // 10
		
		num1 = num1 - num2; // 20
		
		System.out.println("After swapping values are: "+ num1 + " and "+ num2);

	}
}
