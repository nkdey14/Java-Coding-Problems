package app_java_throws;

import java.io.FileWriter;

public class A {
	
	// throws is used in method
	
	// if any exception occurs in a method, then throws take that exception and pass it to the method calling statement 

	public static void main(String[] args) {
		
		A a1 = new A();
		
		try {
			
			a1.test(); // method calling statement
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		} 

	}
	
	public void test() throws Exception
	{
		FileWriter fw = new FileWriter("E:\\textfile\\test.txt");
	}

}
