package log_p3;

import java.util.Arrays;

public class Index_with_Duplicate_Array {

	public static void main(String[] args) {
		
		int[] a = {10,10,20,20,30,40,50,50};
		
/*		int[] a = {20,10,30,10,20,50,40,50};
		
		Arrays.sort(a);
		
		System.out.print("After sorting array is: ");
		
		for(int i: a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
*/		
		int pos = 0;
		
		System.out.println("Duplicate elements are:");
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] == a[i+1])
			{
				pos = i+1;
				
				System.out.println("Position: "+ pos + " ---> value: "+ a[i+1]);
			}
		}
	}
}
