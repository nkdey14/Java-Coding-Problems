package app_java_strings;

public class Pattern2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) // i = 3, 3 <= 5
		{
			for(int j=1; j<=5; j++) // j = 1, 1 <= 5
			{
				if(i == 1 || i == 5 || j == 1)
				{
					System.out.print("* ");
				}
				else if(i > 1 && i < 5 && j > 1 && j < 5)
				{
					System.out.print(" ");
				}
				else if((i > 1 && j == 5) || (i < 5 && j == 5))
				{
					System.out.print("  "+" *");
				}
				
			}
			System.out.println();
		}

	}

}
