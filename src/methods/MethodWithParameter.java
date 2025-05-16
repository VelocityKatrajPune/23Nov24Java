package methods;

public class MethodWithParameter {

	public static void main(String[] args) {

		MethodWithParameter mo= new MethodWithParameter();
		mo.add(1, 1);
		mo.add(10, 2);
		mo.add(100, 90);
		sub(100, 90);
		sub(200, 100);
		mo.add(1, 10);
		mo.add(2, 5);
		sub(9, 1);
		
	}

	public void add(int a, int b)// method with parameters
	{
		//int a;
		//int b;
		int sum;
		sum=a+b;
		System.out.println("Sum is "+sum);
	}
	
	public static void sub(int a, int b)
	{
		int sub;
		sub=a-b;
		System.out.println("Sub is "+sub);
	}
}
