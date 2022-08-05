package app_java_regex_4;

import java.util.StringTokenizer;

public class Count_Num_Of_Words_Using_StringTokenizer {

	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("Pankaj Sir Academy");
		
		int count = 0;
		
		while(str.hasMoreTokens()) {
			
			System.out.println(str.nextToken());
			
			count++;
		}
		
		System.out.println("Word count: "+ count);
	}
}
