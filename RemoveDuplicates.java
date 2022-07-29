package app_java_arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
	//	int[] a = {1,1,2,2,3,4,5,5};
		
		int[] a = {5,1,2,2,1,3,4,5,3,2,5,4};
		
		Arrays.sort(a);
		
		int n = a.length;
		
		int[] temp = new int[n];
		
		int j = 0;
		
		for(int i=0; i<n-1; i++)
		{
			if(a[i] != a[i+1])
			{
				temp[j++] = a[i];
			}
		}
		
		temp[j++] = a[n-1];
		
		System.out.print("Array after removing duplicates is: ");
		
		for(int i=0; i<j; i++)
		{
			System.out.print(temp[i]+" ");
		}

	}

}
