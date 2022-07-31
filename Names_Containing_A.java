package app_java_strings;

public class Names_Containing_A {

	public static void main(String[] args) {
		
		String[] names = new String[]{"Nobita", "Naruto", "Noddy", "Shinchan", "Oswald"};
		
		int count = 0;
		
		System.out.print("Names which contain 'A' in them are: ");
		
		for(int i=0; i<names.length; i++) // i = 4, 4 < 5
		{
			String s = names[i]; // s = Oswald
			
			for(int j=0; j<s.length(); j++) // j = 3, 3 < 6
			{
				if(s.charAt(j) == 'a' || s.charAt(j) == 'A')
				{
					System.out.print(s+" "); // Nobita Naruto Shinchan Oswald
					
					count++; // 4
				}
			}
		}
		
		System.out.println("\nCount = " + count);

	}

}
