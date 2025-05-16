package constructor;

public class D {

	//variables
	int x;
	String name;
	boolean passStatus;
	
	//constructors
	
//	public D()
//	{
//		
//	}
	
	public D()
	{
		System.out.println("This is user defined without parameter constructor");
		System.out.println(x);
		System.out.println(name);
		System.out.println(passStatus);
		System.out.println("==============================");
	}
	
	public D(int a)
	{
		System.out.println("This is user defined with single parameter constructor");
		x=a;
		System.out.println(x);
		System.out.println(name);
		System.out.println(passStatus);
		System.out.println("==============================");
	}
	
	public D(boolean p, String s)
	{
		passStatus=p;
		name=s;
		System.out.println(x);
		System.out.println(name);
		System.out.println(passStatus);
		System.out.println("==============================");
	}
	
	public static void main(String[] args) {
		
//		D d3= new D();
		D d= new D();
		D d1= new D(100);
		D d2= new D(true, "Pune");

	}
	
	//regular methods

}
