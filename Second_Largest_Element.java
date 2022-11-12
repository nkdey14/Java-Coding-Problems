package p6;

public class Second_Largest_Element {

	public static void main(String[] args) {
		
		int[] a = {12,4,2,6,89,44,99};
		
		int max = a[0];
		
		int s_max = a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i]; //max =  99
			}
		}
		
//		System.out.println(max);
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i] > s_max && a[i] < max) 
			{
				s_max = a[i];
			}
		}
		
		System.out.println("Second largest element is: "+ s_max);
	}
}
