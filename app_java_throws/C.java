package app_java_throws;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FileReader fr = new FileReader("E:\\textfile\\test.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println(br.readLine());
		
		Thread.sleep(5000);
		
		System.out.println(br.readLine());
	}
}
