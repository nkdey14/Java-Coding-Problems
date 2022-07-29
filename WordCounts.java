package app_java_strings;

public class WordCounts {

	public static void main(String[] args) {
		
		String s = " Pankaj Sir Academy ";
		
		String[] str = s.trim().split(" ");
		
		System.out.println("Number of words: "+str.length);
		
		for(String i: str)
		{
			System.out.println(i);
		}

	}

}
