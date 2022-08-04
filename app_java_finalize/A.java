package app_java_finalize;

public class A extends Object {
	
	protected void finalize()
	{
		System.out.println(100);
	}

	public static void main(String[] args) {
		
		A a1 = new A();
		
		a1 = null;
		
		System.gc();

	}

}
