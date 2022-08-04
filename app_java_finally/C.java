package app_java_finally;

//case - 3 ---> Exception did not occur, catch block will be ignored but still finally block will execute 

public class C {

public static void main(String[] args) {
		
		System.out.println("Program Started");
		System.out.println("Program is Running");
		
		int x = 10;
		
		try {
			
			System.out.println(x/2);
			
		} catch (Exception e) {
			
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
