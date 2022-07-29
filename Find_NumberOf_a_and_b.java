package app_java_strings;

import java.util.Scanner;

public class Find_NumberOf_a_and_b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String with a combination of a and b: ");
		
		String s = sc.next();
		
		int count_a = 0;
		
		int count_b = 0;
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == 'a') // checking whether the the particular character matches with 'a'
			{
				count_a++;
			}
			else if(s.charAt(i) == 'b') // checking whether the the particular character matches with 'b'
			{
				count_b++;  
			}
		}
		
		// displaying the number of occurrences of a and b
		
		System.out.println("Count of a's in the given String: "+count_a);
		
		System.out.println("Count of b's in the given String: "+count_b);

	}

}
