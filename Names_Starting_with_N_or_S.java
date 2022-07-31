package app_java_strings;

public class Names_Starting_with_N_or_S {

	public static void main(String[] args) {
		
		String[] names = new String[]{"Nobita", "Naruto", "Noddy", "Shinchan", "Oswald"};
		
		int count = 0;
		
		System.out.print("Names Starting with 'N' or 'S' are: ");
		
		for(int i=0; i<names.length; i++) // i = 4, 4 < 5
		{
			String s = names[i]; // s = Oswald
			
			if(s.charAt(0) == 'N' || s.charAt(0) == 'S')
			{
				System.out.print(s+" "); // Nobita Naruto Noddy Shinchan
				count++; // 4
			}
		}
		
		System.out.println("\nCount = "+count); // 4

	}

}
