package inheritance;

public class SingleLevel {

	public static void main(String[] args) 
	{
		A a = new A();
		a.method1();// calling non static method from A class
		A.method2();// calling static method from A class

		B b = new B();
		b.method3();// calling non static method from B class
		B.method4();// calling static method from B class
		System.out.println("==============================");
		

		b.method1();//calling non static method from super class using object of sub class 
		B.method2();//calling static method from super class using reference of sub class
		b.method3();//calling non static method from sub class using object of sub class 
		B.method4();//calling static method from sub class using reference of sub class
		
		
	}

}
