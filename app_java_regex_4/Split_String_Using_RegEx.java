package app_java_regex_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split_String_Using_RegEx {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("\\s");
		
		Matcher m = p.matcher("Pankaj Sir Academy");
		
		int c = 0;
		
		while(m.find()) {
			
			System.out.print(m.group());
			
			c++;
		}
	}

}
