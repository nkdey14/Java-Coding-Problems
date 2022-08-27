package log_p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Count_chars_and_find_occurrences_of_chars_in_Name {

	public static void main(String[] args) {
		
		String s = "Nitin";
		
		Pattern p = Pattern.compile("\\S");
		
		Matcher m = p.matcher(s);
		
		int count = 0;
		
		while(m.find()) {
			
			count++;
		}
		
		System.out.println("Count of Characters = "+ count);
		
		int count_n = 0, count_i = 0, count_t = 0;
		
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i) == 'N' || s.charAt(i) == 'n') {
				
				count_n++;
			}
			else if(s.charAt(i) == 'i') {
				
				count_i++;
			}
			else if(s.charAt(i) == 't') {
				
				count_t++;
			}
		}
		
		System.out.println("Count of N/n: "+ count_n);
		System.out.println("Count of i:"+ count_i);
		System.out.println("Count of t:"+ count_t);
	}
}
