package app_java_regex_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {

	public static void main(String[] args) {
		
		Pattern  p = Pattern.compile("a?"); // 0 / 1 occurrences
		
		Matcher m = p.matcher("aabaaababaaaab");
		
		while(m.find()) {
			
			System.out.println(m.start()+"......"+m.group());
		}
	}
}
