package app_java_thread3;

public class C extends Thread {

	public static void main(String[] args) {
		
		C c1 = new C();
		
		System.out.println(c1.getState());
		
		c1.start();
		
		try {
			
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(c1.getState());
	
	}
	
	public void run()
	{
		System.out.println("test");
	}

}
