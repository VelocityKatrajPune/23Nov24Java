package thisAndSuper;

public class A {
	
	int z=1;
	int a=90;//global variable
	String name="VCTC";//global variable
	static int c=1;
	public static void main(String[] args) {
		
		A a= new A();
		a.test();
	}
		
	
	public static void test1()
	{
		int d=9;
	}
	
	public void test()
	{
		//static int c=2;
		int a=10;//local variable
		int sum=a+10;// used local value of a by default
		System.out.println(sum);
		
		int sum1=this.a+10;//used global value of a using this keyword
		System.out.println(sum1);
		
		String name="Pune";//local variable
		System.out.println(name);// calling local variable
		
		System.out.println(this.name);
	}

}
