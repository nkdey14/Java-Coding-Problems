package app_java_arrays;

public class Find_and_count_duplicates_in_Array1 {

	public static void main(String[] args) {
		
		int[] a = {10,10,20,20,30,40,40,50,50};
		
		int count = 0;
		
		System.out.print("Duplicate elements are: ");
		
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i] == a[i+1])
			{
				System.out.print(a[i]+" ");
				
				count++;
			}
		}
		System.out.println();
		
		System.out.println("Count of duplicate elements is: "+ count);
	}
}
