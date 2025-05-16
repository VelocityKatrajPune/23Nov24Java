package thisAndSuper;

public class C {
	
	public C()
	{
		this(11);
		System.out.println("without parameter constructor");
		
	}
	public C(int a)
	{
		this("Pune");
		System.out.println("a value is "+a);
		System.out.println("with int parameter constructor");
	}
		
	public C(String name)
	{
		System.out.println("name is "+name);
		System.out.println("with String parameter constructor");
		
	}
	
	public C(int a, String b)
	{
		System.out.println("int value is "+a);
		System.out.println("String value is "+b);
		System.out.println("with two parameter");
		
	}
	
	public static void main(String[] args) 
	{
	 C c= new C();
	

	}

}
