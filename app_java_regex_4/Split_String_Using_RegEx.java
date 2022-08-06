package app_java_regex_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split_String_Using_RegEx {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(" ");
		
		String[] str = p.split("Pankaj Sir Academy");
		
		for(String s: str)
		{
			System.out.println(s);
		}
	}

}
