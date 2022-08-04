package app_java_thread3;

public class B extends Thread {
	
	int total = 0;
	
	public synchronized void run()
	{
		for(int i=0; i<1000; i++)
		{
			total = total + i;
		}
		
		notify();
	}
}
