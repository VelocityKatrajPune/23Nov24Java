package interfaceStudy;

public final class A {
	
	public static void main(String[] args) {
		
		int a=10;
		System.out.println(a);
		a=a+1;
		System.out.println(a);
		System.out.println("=================");
		
		final int b=10;
		//System.out.println(b);
		//b=b+1;
		
//		final-->variable
//		final-->methods
//      final-->class		
		
		
		
	}
	public void test1()
	{
		System.out.println("test1 from A class");
	}
	
	public final void test2()
	{
		System.out.println("test2 from A class");
	}

}
