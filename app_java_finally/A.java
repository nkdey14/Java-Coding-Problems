package app_java_finally;

// case - 1 ---> Exception occurred, catch block will handle the exception & finally block will execute

public class A {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		System.out.println("Program is Running");
		
		int x = 10;
		
		try {
			
			System.out.println(x/0);
			
		} catch (ArithmeticException e) {
			
			e.printStackTrace();
			
			System.out.println("Exception occurred and handled successfully");
		}
		finally {
			
			System.out.println("This is finally block");
		}
		
		System.out.println("Program is Completed");
		System.out.println("Program is Exited");
	}
}
