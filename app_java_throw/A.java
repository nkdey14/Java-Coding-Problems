package app_java_throw;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		int balance = 1000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount you want to withdraw: ");
		
		int amount = sc.nextInt();
		
		if(balance > amount)
		{
			System.out.println("Please collect the cash");
		}
		else
		{
			try {
				
				throw new InSufficientFunds();
				
			} catch (InSufficientFunds e) {
				
				System.out.println(e);
				
				System.out.println("Low Balance!");
				
			}
		}
	}
}
