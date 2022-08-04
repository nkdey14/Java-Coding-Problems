package app_java_thread3;

public class D extends Thread{
	
	String name;
	
	D(String name)
	{
		this.name = name;
	}

	public static void main(String[] args) {
		
		D d1 = new D("abc");
		
		D d2 = new D("xyz");
		
		d1.setPriority(1);
		
		d2.setPriority(10);
		
		System.out.println(d1.getPriority());
		
		System.out.println(d2.getPriority());
		
		d1.start();
		
		d2.start();

	}
	
	public void run()
	{
		System.out.println(this.name);
	}

}
