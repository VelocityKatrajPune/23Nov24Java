package thisAndSuper;

public class D extends C{

	public D()
	{
		System.out.println("Without parameter constructor");
	} 
	
	public D(int a)
	{
		super(120, "Velocity");
		System.out.println("a value is "+a);
		System.out.println("With parameter constructor");
	}
	
	public static void main(String[] args) {
		
		D d = new D(99);
		
	}

}
