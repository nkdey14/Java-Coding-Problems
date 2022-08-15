package app_java_HashTable;

import java.util.Hashtable;

public class A {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		
		hashTable.put(100, "Rizwan");
		hashTable.put(102, "Abhishek");
		hashTable.put(102, "Amarjit");
		
		System.out.println(hashTable);
		System.out.println(hashTable.get(102));
		System.out.println(hashTable.values());
		System.out.println(hashTable.keySet());
	}
}
