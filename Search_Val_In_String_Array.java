package app_java_strings;

import java.util.Scanner;

public class Search_Val_In_String_Array {

	public static void main(String[] args) {
		
		String[] str = {"Ram", "Pranay", "Nitin", "Govind", "Sanjay", "Ranjan"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String to Search: ");
		
		String s = sc.next();
		
		int flag = 0;
		
		int pos = 0;
		
		for(int i=0; i<str.length; i++)
		{
			if(str[i].equalsIgnoreCase(s))
			{
				flag = 1;
				
				pos = i;
				
				break;
			}
		}
		
		if(flag == 1)
		{
			System.out.println(s + " is found at position "+ pos);
		}
		else
		{
			System.out.println(s + " is not found");
		}

	}

}
