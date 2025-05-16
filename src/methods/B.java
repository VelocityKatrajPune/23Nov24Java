package methods;

public class B {
	public static void main(String[] args) {
		demo();
		System.out.println("main method is running");
		//to static method call from same class
		//in main method just call with method name
		//syantax: methodName();
		demo();// we are calling static method from same class
		sample();
		// to call static regular methods from another class
		// syantx: className.methodName();
		C.test();// calling static regular methof from another class
	//	A.test();//calling static regular methof from another class
	}
	public static void demo() // method declartion 
	{
		// method body, definition      --> complete method
		System.out.println("static method demo is running");
	}
	public static void sample()
	{
		System.out.println("static method sample is running");
	}
	
}
