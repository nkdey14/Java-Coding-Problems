package p6;

public class String_len {

	public static void main(String[] args) {
		
		String s = "Pankaj Sir Academy";
		
		char[] ch = s.toCharArray();
		
		int count = 0;
		
		for(char c: ch) {
			
			count++;
		}
		
		System.out.println(count);
	}
}
