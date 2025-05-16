package polymorphism;

public class C {

	public static void main(String[] args) {
	
		System.out.println("Hi Good Moring");
		main();
		C c= new C();
		c.main(10);
	}
	
	// can we overload main method?
	public static void main()
	{
		System.out.println("test overload");
	}
	
	// can we overload main method as non static
	public void main(int a)
	{
		System.out.println(a);
		System.out.println("overload main method with parameter");
	}

}
