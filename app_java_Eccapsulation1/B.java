package app_java_Eccapsulation1;

public class B {

	public static void main(String[] args) {
		
		A a1 = new A();
		
		//Can interact with the variables only through methods
		
		a1.setId(12);
		int x = a1.getId(); 
		System.out.println(x);
		
		a1.setName("Nitin");
		String y = a1.getName();
		System.out.println(y);
	}
}
