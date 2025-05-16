package inheritance;

public class B extends A {
	
	int c=30;
	static int d=40;
	
	public void method3()
	{
		System.out.println("non static method 3 from Class B");
	}

	public static void method4()
	{
		System.out.println("static method 4 from Class B");
	}
}
