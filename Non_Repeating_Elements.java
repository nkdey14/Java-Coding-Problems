package p4;

import java.util.Arrays;

public class Non_Repeating_Elements {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, -1, 1, 3, 1};
		
		Arrays.sort(a);
		
		int rmv = 0;
		
//		for(int i: a)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println();
				
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] == a[i+1])
			{
				rmv = a[i];
			}
		}
		
		System.out.print("Result: ");
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i] == rmv)
			{
				continue;
			}
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
