package thisAndSuper;

public class Demo {

	int x=10;// global variable
	
	public static void main(String[] args) {
		Demo d= new Demo();
		d.test();

	}
	
	public void test()
	{
		int x=1;//local variable
		int mul=x*10;
		System.out.println(mul);
		
		int mul1= this.x*10;
		System.out.println(mul1);
		
	}

}
