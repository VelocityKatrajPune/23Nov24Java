package demo;

public class Test {

	
	public Test()
	{
		
	}
	
	public Test(int a,int b)
	{
		
	}
	public Test(long b)
	{
		
	}
	public Test(String a)
	{
		
	}
	public static void main(String[] args) {
		
		Test t= new Test();
		t.a();// calling non static regular method from same class
		b();//calling static regular method from same class
		
		Test1 t1= new Test1();
		t1.c();//calling non static regular method from another class
		Test1.d();////calling static regular method from another class
	}
	
	public void a()
	{
		System.out.println("non static regular method A from Test class");
	}

	public static void b()
	{
		System.out.println("static regular method B from Test class");
	}
}
