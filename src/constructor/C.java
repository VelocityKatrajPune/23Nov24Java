package constructor;

public class C {

	int a;//variable declration
	int b;//variable declration
	int c=10;// variable declartion+ initialization 
	
	public C()// user defined without para
	{
		a=9;
		b=91;
	}
	
	public C(int x)
	{
		a=x;
		//b?
	}
	
	public C(int p, int q)
	{
		a=p;
		b=q;
	}
	
	public static void main(String[] args) {
		C c1= new C();// we reated object using without paramter constructor
		c1.add();
		
		C c2= new C(99);
		c2.add();
		
		C c3= new C(1, 1);
		c3.add();
		
		C c4= new C(10, 10);
		c4.add();
	}
	
	public void add()
	{
		int sum=a+b;//9,91
		System.out.println("sum is "+sum);
	}

}
