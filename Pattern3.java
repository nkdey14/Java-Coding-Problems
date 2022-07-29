package app_java_strings;

public class Pattern3 {

	public static void main(String[] args) {
		
		int k = 1;
		
		for(int i=1; i<=5; i++) // i = 5, 5 <= 5 
		{
			for(int j=1; j<=i; j++) // j = 5, 5 <= 5
			{
				System.out.print(k++ +" "); // 1   2 3   4 5 6   7 8 9 10    11 12 13 14 15
			}
			System.out.println();
		}

	}

}
