package app_java_HashMap;

import java.util.HashMap;

public class A {

	public static void main(String[] args) {
		
		HashMap<Integer, String> studentInfo = new HashMap<>();
		
		studentInfo.put(100, "Nitin");
		studentInfo.put(101, "Akash");
		studentInfo.put(102, "Harish");
		studentInfo.put(103, "Aniket");
		
		System.out.println(studentInfo);
		System.out.println(studentInfo.get(101));
		System.out.println(studentInfo.values());
		System.out.println(studentInfo.keySet());

	}
}
