package app_java_HashSet;

import java.util.HashSet;

public class A {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(30);
		hashSet.add(null);
		
		System.out.println(hashSet);

	}
}
