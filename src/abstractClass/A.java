package abstractClass;

public abstract class A {

	
	public A()
	{
	int a=1;
	int b=2;
	}
	public static void main(String[] args) 
	{
//		A a= new A();// we cant create object of an abstract class
//		a.test1();
//		a.test2();

		test5();
	}
	
	
	
	public static void test1()
	{
		
	}

	
	
	public abstract void test2();
	
	
	public void test3()
	{
		System.out.println();
	}
	
	public abstract  void test4();
	
	public static void test5()
	{
		
	}
	//static method cant be asbtract method
	
	public abstract void test6();
	
	public abstract void test7();

}
