package log_p3;

public class Replace_Duplicates {

	public static void main(String[] args) {
		
		int[] a = {20,10,30,10,20,50,40,50};
		
		// Sorting array
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<a.length-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					
					a[j] = a[j+1];
					
					a[j+1] = temp;
				}
			}
		}
		
		System.out.print("After sorting array is: ");
		
		for(int i: a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		// Replacing Duplicate elements with -1
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] == a[i+1])
			{
				a[i+1] = -1;
			}
		}
		
		// Printing -1 in place of Duplicate elements
		
		System.out.print("Updated array is: ");
		
		for(int i: a)
		{
			System.out.print(i+" ");
		}
	}
}
