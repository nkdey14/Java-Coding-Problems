package app_java_regex_4;

import java.util.StringTokenizer;

public class Split_Date_Using_StringTokenizer {

	public static void main(String[] args) {
		
		StringTokenizer str = new StringTokenizer("05-08-2022","-");
		
		int count = 0;
		
		while(str.hasMoreTokens()) {
			
			System.out.println(str.nextToken());
			
			count++;
		}
		
		System.out.println("Word count:"+ count);

	}

}
