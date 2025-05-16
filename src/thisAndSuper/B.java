package thisAndSuper;

public class B extends A{
	
	int a=88;
	
	public static void main(String[] args) 
	{
		B b= new B();
		b.demo();
	}
	
	public void demo()
	{
		int a=11;//local value of a
		int sum=a+10;// used local value of a
		System.out.println(sum);
		
		int sum1= this.a+10;//used global value of a
		System.out.println(sum1);
		
		int sum2= super.a+10;
		System.out.println(sum2);
		System.out.println(z);
	}

}
