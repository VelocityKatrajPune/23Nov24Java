package demo;

public class B {

	public static void main(String[] args) {
		// calling static regular method, from same class
		//methodName();
		sample();
		// calling (invoke)static regular method from another class
		// className.methodName();
		A.sample1();
		
		//non static method call-->
		// to call non-static method we need object of a class
		//className object = new className();
		B b= new B();
		// objectName.methodName();
		b.test();
		
		// non static method call from another class
		// objectName.methodName();
	
		A a= new A();
		a.test1();
	
	
	}
	
	
	public static void sample()//static regular method
	{
		System.out.println("This is static regular method");
	}
	public void test()// non-static regular method
	{
		System.out.println("This is non static regular metod");
	}

}
