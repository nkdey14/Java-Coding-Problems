package app_java_arrays;

import java.util.Scanner;

public class Search_Val_In_Array {

	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50,60};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value to search in the Array: ");
		
		int val = sc.nextInt();
		
		int flag = 0;
		
		int pos = 0;
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == val)
			{
				flag = 1;
				
				pos = i;
				
				break;
			}
		}
		
		if(flag == 1)
		{
			System.out.println("Element found in the array at position "+ pos);
		}
		else
		{
			System.out.println("Element not found in the array");
		}
	}

}
