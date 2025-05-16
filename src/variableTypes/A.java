package variableTypes;

public class A {

	int a=10;//global variable
	int b=20;
	int c=30;//non static global variable
	static int d=90;//static global vriable
	
	public static void main(String[] args) 
	{
		

	}

	
	public void add()
	{
		int x=9;//local variable
		int y=1;
		int sum=x+y;
		System.out.println(sum);
		int sum1= a+b;
		System.out.println(sum1);
	}
	
	public void sub()
	{
		int x=100;
		int y=120;
		//int sub1= x-y;
		int sub=a-b;
		System.out.println(sub);
	}
}
