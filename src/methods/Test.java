package methods;

public class Test {

	public static void main(String[] args) {
		Test t= new Test();// object creation
		t.b();//calling non-static method from same class
		a();//calling static method from same class
		// to call non static method from anoter class
		// we need to craete object of that class
		Sample s1= new Sample();// created object of another class
		s1.method2();// calling non static method from another class
	}
	
	public static void a()
	{
		System.out.println("static method from Test class");
	}

	public void b() 
	{
		System.out.println("non-static method from Test class");
	}
}
