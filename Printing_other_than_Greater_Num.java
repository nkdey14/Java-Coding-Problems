package app_java_prog1;

public class Printing_other_than_Greater_Num {

	public static void main(String[] args) {
		
		String s = "11111111111222223333333333333333444444444";
		
		int count_1 = 0, count_2 = 0, count_3 = 0, count_4 = 0;
		
		// finding the count of 1's 2's 3's & 4's
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) == '1')
			{
				count_1++;
			}
			else if(s.charAt(i) == '2')
			{
				count_2++;
			}
			else if(s.charAt(i) == '3')
			{
				count_3++;
			}
			else if(s.charAt(i) == '4')
			{
				count_4++;
			}
		}
		
		System.out.println("Count of 1's: "+ count_1);
		System.out.println("Count of 2's: "+ count_2);
		System.out.println("Count of 3's: "+ count_3);
		System.out.println("Count of 4's: "+ count_4);
		
		if(count_1 > count_2 && count_1 > count_3 && count_1 > count_4)
		{
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i) == '1')
				{
					continue;
				}
				System.out.print(s.charAt(i)+" ");
			}
		}
		else if(count_2 > count_1 && count_2 > count_3 && count_2 > count_4)
		{
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i) == '2')
				{
					continue;
				}
				System.out.print(s.charAt(i)+" ");
			}
		}
		else if(count_3 > count_1 && count_3 > count_2 && count_3 > count_4)
		{
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i) == '3')
				{
					continue;
				}
				System.out.print(s.charAt(i)+" ");
			}
		}
		else if(count_4 > count_1 && count_4 > count_2 && count_4 > count_3)
		{
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i) == '4')
				{
					continue;
				}
				System.out.print(s.charAt(i)+" ");
			}
		}
	}
}
