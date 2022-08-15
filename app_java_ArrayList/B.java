package app_java_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class B {

	public static void main(String[] args) {
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		// add()
		
		x.add(10);
		x.add(20);
		x.add(30);
		
		System.out.println(x);
		
		x.add(1,500);
		System.out.println(x);
		
		ArrayList<Integer> y = new ArrayList<Integer>();
		
		y.add(300);
		y.add(500);
		
	//	System.out.println(y);
		
		x.addAll(2, y);
		System.out.println(x);
		
		// contains()
		
		if(x.contains(300)) {
			
			System.out.println("Yes present");
		}
		else {
			
			System.out.println("Not present");
		}
		
		// remove()
		
		x.remove(1);
		System.out.println(x);
		
		System.out.println(x.get(1));
		
		// contains()
		
		System.out.println(x.contains(300));
		System.out.println(x.contains(600));
		
		// get()
		
		System.out.print("ArrayList elements are: ");
		
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
	}
}
