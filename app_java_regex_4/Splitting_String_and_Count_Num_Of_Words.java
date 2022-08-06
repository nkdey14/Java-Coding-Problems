package app_java_regex_4;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Splitting_String_and_Count_Num_Of_Words {

	public static void main(String[] args) {
		
/* //	Approach - 1
	  
	  	String s = "Pankaj Sir Academy";
		
		String[] str = s.split(" ");
		
		for(String i: str)
		{
			System.out.println(i);
		}
		
		System.out.println(str.length);
*/
		
/*	//	Approach - 2
 
		StringTokenizer str = new StringTokenizer("Pankaj Sir Academy");
		
		int count = 0;
		
		while(str.hasMoreTokens()) {
			
			System.out.println(str.nextToken());
			
			count++;
		}
		
		System.out.println(count);
		
*/
		
		// Approach - 3
		
		Pattern p = Pattern.compile(" ");
		
		String[] str = p.split("Pankaj Sir Academy");
		
		for(String s: str)
		{
			System.out.println(s);
		}
		
		System.out.println(str.length);
	}

}
