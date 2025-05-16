package methods;

public class MathOperation {

	public static void main(String[] args) {
		
		MathOperation mo= new MathOperation();//created object of class
		mo.add();// calling non static method from same class
		mo.add();
		sub();// calling static method from same class
		
		Demo d=new Demo();// created object of other class
		d.mul();// calling non static method from another class
		Demo.div();//calling static method from another class
	}
	public void add() //method without parameter
	{
		int a;
		int b;
		int sum;
		
		a=10;
		b=90;
		sum=a+b;
		
		System.out.println("sum is "+sum);
	}
	
	public static void sub()
	{
		int a;
		int b;
		int sub;
		
		a=10;
		b=90;
		sub=a-b;
		System.out.println("sub is "+sub);	
	}
}
