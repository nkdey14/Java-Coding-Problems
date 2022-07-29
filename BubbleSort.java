package app_java_arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a = {4,1,7,2,6,3};
		
		int n = a.length;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					
					a[j] = a[j+1];
					
					a[j+1] = temp;
				}
			}
		}
		
		System.out.print("Sorted array is: ");
		
		for(int i: a)
		{
			System.out.print(i+" ");
		}

	}

}
