package constructor;

public class A {

	
//	public A()
//	{
//	defualt constructor--> compiler will create
//	}
	
	public A()// user defined constructor without paramter
	{
		System.out.println("I am without parameter constructor");
	}
	public A(int a)// user defined with parameter constructor
	{
		System.out.println("Paramter value is "+a);
		System.out.println("User defined with parameter constructor");
	}
	
	//invoke 
	
	public static void main(String[] args) {
	 
		//int a=10;
		A a= new A();//object created
		A a1= new A(9);
	}
	
	public void test()
	{
		System.out.println("test method");
	}

	public static void test1()
	{
		System.out.println("test1 method");
	}
}
