package app_java_strings;

import java.util.Scanner;

public class CheckParenthesis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the opening and closing Parenthesis  -> () : ");
		
		String s = sc.next();
		
		int count1 = 0;
		
		int count2 = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == '(')
			{
				count1++;
			}
			else if(s.charAt(i) == ')')
			{
				count2++;
			}
		}
		
		if(count1 == count2)
		{
			System.out.println("No Error");
		}
		else
		{
			System.out.println("Error");
		}

	}

}
