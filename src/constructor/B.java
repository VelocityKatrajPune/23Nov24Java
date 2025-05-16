package constructor;

public class B 
{
	public B()//user defined- without parameter constructor
	{
		System.out.println("zero para constructor is running");
	}
	
	public B(int a)
	{
		System.out.println("with single para constructor is running");
		System.out.println(a);
	}
	
	public B(float a)
	{
		System.out.println(a);
	}
	
	public B(int a, int b)//user defined with two parameter constructor
	{
		System.out.println(a);
		System.out.println(b);
	}
		
	public static void main(String[] args) {
	
		B b= new B();//using without parameter constructor
		B b1= new B(11);//using single parameter constructor
		B b2= new B(12.12f);//using single parameter constructor
		B b3= new B(1, 2);//using two parameter constructor
	}

}
