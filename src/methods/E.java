package methods;

public class E {

	public static void main(String[] args) {
		
		demo();// calling static method from same class
		// to call static method from another class
		//className.methodName();
		C.test();
		
	}

	public static void demo()
	{
		System.out.println("This is demo method form E class");
	}
	
	
}
