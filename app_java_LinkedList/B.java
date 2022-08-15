package app_java_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class B {

	public static void main(String[] args) {
		
		List<Integer> x = new LinkedList<Integer>();
		
		x.add(10);
		x.add(20);
		x.add(30);
		
		System.out.println(x);
		
		x.add(1,500);
		System.out.println(x);
		
		List<Integer> y = new LinkedList<Integer>();
		
		y.add(300);
		y.add(600);
		
		x.addAll(2, y);
		System.out.println(x);
		
		if(x.contains(600)) {
			
			System.out.println("Yes present");
		}
		else {
			
			System.out.println("Not present");
		}
		
		System.out.println("Size of LinkedList: "+ x.size());
		
		// get()
		
		System.out.print("LinkedList elements are: ");
		for(int i=0; i<x.size(); i++)
		{
			System.out.print(x.get(i)+" ");
		}
		System.out.println();
		
		// Iterator
		
		Iterator itr = x.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println(x.contains(300));
		System.out.println(x.contains(40));
	}
}
