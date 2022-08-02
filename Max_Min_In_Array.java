package app_java_arrays;

import java.util.Scanner;

public class Max_Min_In_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		System.out.println("Enter the array elements: ");
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int min = a[0];
		
		int max = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			else if(a[i] < min)
			{
				min = a[i];
			}
		}
		
		System.out.print("Array elements are: ");
		
		for(int j: a)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		
		System.out.println("Maximum value: "+max);
		
		System.out.println("Minimum value: "+min);

	}

}
