package app_java_throws;

import java.io.FileWriter;

public class B {

public static void main(String[] args) throws Exception {
		
		A a1 = new A();
		
		a1.test();

	}
	
	public void test() throws Exception
	{
		FileWriter fw = new FileWriter("E:\\textfile\\test.txt");
	}

}
