package app_java_LinkedHashSet;

import java.util.LinkedHashSet;

public class A {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(30);
		hashSet.add(null);
		
		System.out.println(hashSet);

	}
}
