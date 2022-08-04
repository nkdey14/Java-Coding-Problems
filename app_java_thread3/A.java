package app_java_thread3;

public class A {
	
	public static void main(String[] args) {
		
		B b1 = new B();
		
		B b2 = new B();
		
		b1.start();
		
		b2.start();
		
		synchronized(b1)
		{
			try {
				
				b1.wait();
				
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println(b1.total);
		
		synchronized(b2)
		{
			try {
				
				b2.wait();
				
			} 
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println(b2.total);
	}
}
