package app_java_cloning;

// Cloning is a process of creating replica of a particular object
// by copying all the contents from one object to another object

public class A implements Cloneable {

	public static void main(String[] args) {
		
		A a1 = new A();
		
		try {
			A a2 = (A)a1.clone();
			
			System.out.println(a1);
			
			System.out.println(a2);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
