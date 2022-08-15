package app_java_LinkedList;

import java.util.LinkedList;

public class A {

	public static void main(String[] args) {
		
		LinkedList<Integer> x = new LinkedList<>();
		
		// add(), addFirst(), addLast()
		
		x.add(10);
		x.add(20);
		x.add(30);
		
		System.out.println(x);
		
		x.addFirst(100);
		System.out.println(x);
		
		x.addFirst(200);
		System.out.println(x);
		
		x.addLast(300);
		System.out.println(x);
		
		x.addLast(400);
		System.out.println(x);
		
		// remove(), removeFirst(), removeLast()
		
		x.remove();
		System.out.println(x);
		
		x.remove();
		System.out.println(x);
		
		x.removeFirst();
		System.out.println(x);
		
		x.removeLast();
		System.out.println(x);
		
		// get()
		
		System.out.print("LinkedList elements are: ");
		
		for(int i=0; i<x.size(); i++)
		{
			System.out.print(x.get(i)+" ");
		}
		System.out.println();

	}
}
