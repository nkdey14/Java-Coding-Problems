package app_java_arrays;

import java.util.Scanner;

public class FInd_Max2_Min2_Salary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of salaries you want to enter: ");
		
		int n = sc.nextInt(); // taking the number of salaries as input from the user
		
		int[] a = new int[n];
		
		System.out.println("Enter the salaries: ");
		
		// Storing the salaries in an array
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		// displaying the salaries
		
		System.out.print("\nSalaries are: ");
		
		for(int j: a)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		
		// Sorting the salary if they are not sorted
		
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
		
		// Removing duplicate salaries if present

		int k = 0;
		
		for(int i=0; i<n-1; i++)
		{
			if(a[i] != a[i+1])
			{
				a[k++] = a[i];
			}
		}
		
		a[k++] = a[n-1];
		
		// displaying the updated salaries
		
		System.out.print("\nUpdated Salaries after sorting and removing duplicates are: ");
		
		for(int i=0; i<k; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
		
		// displaying maximum 2 and minimum 2 salaries
		
		System.out.println("Maximum 2 salaries are: "+ a[a.length-1] + " and " + a[a.length-2]);

		System.out.println("Minimum 2 salaries are: "+ a[0] + " and " + a[1]);
		
		// displaying the 2nd maximum and 2nd minimum salary
		
		System.out.println("\n2nd Maximum Salary: "+ a[a.length-2]);
		
		System.out.println("2nd Minimum Salary: "+ a[1]);
	}

}
