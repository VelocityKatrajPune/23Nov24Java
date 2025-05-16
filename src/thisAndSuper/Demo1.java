package thisAndSuper;

public class Demo1 extends Demo {

	int x=100;
	
	
	public static void main(String[] args) {
		Demo1 d1= new Demo1();
		d1.test1();

	}

	
	public void test1()
	{
		int mul=x*10;
		System.out.println(mul);
		
		int mul1=super.x*10;
		System.out.println(mul1);
	}
	
}
