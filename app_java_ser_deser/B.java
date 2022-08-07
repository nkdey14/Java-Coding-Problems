package app_java_ser_deser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class B {

	public static void main(String[] args) {
		
		A a1 = new A();
		
		try {
			
			FileOutputStream fos = new FileOutputStream("E:\\file.ser");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(a1);
			
			oos.close();
			fos.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
