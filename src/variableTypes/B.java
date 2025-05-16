package variableTypes;

public class B {

	int a=10;//non static global variable
	static int b=20;//static global variable
	
	public static void main(String[] args) 
	{
		
		//create an object of a class
		B b1= new B();
		b1.add();// calling non static method
		sub();// calling static method
		int mul=b1.a*10;// using non static global variable
		int div=10/b;// using static global variable
		
		// calling global variables from another class
		// while calling non static global variable from another class
		// we need to create object of that class
		C c = new C();// created object of another class(C)
		int sum=c.p+100;//using non static global varible from another class
		System.out.println(sum);
		// while calling static global variable from another class
		// we need to use class ref--> className.variableName
		int sub1=C.q-10;// using static variable from another class
		System.out.println(sub1);
		
		int add1=c.p+C.q;
		System.out.println(add1);
	}
	
	public void add()
	{
		int sum=a+b;
		int x=100;
		// non static method will allow
		//static as well as non static variables
	}

	public static void sub()
	{
		// static method will allow
		// only static variables
		//int sub=a-b;
	}
}
