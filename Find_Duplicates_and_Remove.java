package app_java_arrays;

import java.util.Arrays;

public class Find_Duplicates_and_Remove {

	public static void main(String[] args) {
		
		int[] a = {10,10,20,20,30,30,40,40,50,50};
		
//		int[] a = {10,20,10,20,30,40,30,40,50,40,50,50};
//		
//		Arrays.sort(a);
		
		int n = a.length; // 8
		
		int j = 0;
		
		// finding the duplicate elements
		
		System.out.print("Duplicate elements are: ");
		
		for(int i=0; i<n-1; i++) // i = 6, 6 < 7
		{
			if(a[i] == a[i+1])
			{
				System.out.print(a[i]+" "); // 10 20 30 
			}
			
		}
		System.out.println();
		
		// Removing the duplicate elements
		
		for(int i=0; i<n-1; i++)
		{
			if(a[i] != a[i+1])
			{
				a[j++] = a[i];
			}
		}
		a[j++] = a[n-1];
		
		// printing array after removing duplicates
		
		System.out.print("Array after removing duplicate elements is: ");
		
		for(int i=0; i<j; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

	}

}
