package app_java_thread3;

public class E extends Thread {
	
	String name;
	
	E(String name)
	{
		this.name = name;
	}

	public static void main(String[] args) {
		
		E e1 = new E("abc");
		
		E e2 = new E("xyz");
		
		e1.setName("addAmount");
		
		e2.setName("withdrawAmount");
				
		System.out.println(e1.getName());
		
		System.out.println(e2.getName());

		e1.start();
		
		e2.start();

	}
	
	public void run()
	{
		System.out.println(this.name);
	}

}
