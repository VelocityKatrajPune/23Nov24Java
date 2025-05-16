package methods;

public class Sample {

	public static void main(String[] args) {
		// if you want to call non-static method
		// we need object of a class
		// className objectName= new className();
		Sample s= new Sample();// created object of class
		// call non-static method using object
		//objectName.methodName();
		s.method2();//calling non-static method from same class
		method1();// calling static method from same class
	}

	public static void method1()// static regular method 
	{
		System.out.println("static method, method 1 from sample class");
	}
	
	public void method2()// non static regular method
	{
		System.out.println("non-static method, method2 from sample class");
	}
	
}
