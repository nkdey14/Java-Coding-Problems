package app_java_arrays;

import java.util.Arrays;

public class Find_and_count_duplicates_in_Array2 {

	public static void main(String[] args) {
		
		int[] a = {20,10,30,10,40,20,40,50};
		
		Arrays.sort(a);
		
		int c = 0;
		
		System.out.print("Duplicate elements are: ");
		
		for(int i=0; i<a.length-1; i++) // 0 to 6
		{
			if(a[i] == a[i+1])
			{
				System.out.print(a[i]+" ");
				
				c++;
			}
		}
		System.out.println();
		
		System.out.println("Count of duplicate elements is: "+ c);
	}
}
