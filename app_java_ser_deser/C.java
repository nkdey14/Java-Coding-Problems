package app_java_ser_deser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

// De-Serialization
public class C {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("E:\\file.ser");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			A a1 = (A)ois.readObject();
			
			System.out.println(a1.user_name);
			
			System.out.println(a1.password);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
