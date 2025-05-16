package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	{
	
		MethodOverloading mo= new MethodOverloading();
		
		mo.add();
		mo.add(10);
		mo.add(1.5f);
		mo.add();
		test();
		test("hi");
		

	}
		
	public static void test()
	{
		System.out.println("test");
	}
	public static void test(String a)
	{
		System.out.println("test with parameter");
	}
	
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void add(int a)
	{
		int sum=a+10;
		System.out.println(sum);
	}
	
	public void add(float a)
	{
		float sum=10+a;
		System.out.println(sum);
	}
	
	public void add(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
}
