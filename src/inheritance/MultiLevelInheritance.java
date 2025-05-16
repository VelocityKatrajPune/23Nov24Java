package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		
		A a= new  A();
		B b= new B();
		C c= new C();
		
	a.method1();
	
	b.method1();
	b.method3();
	
	c.method1();
	c.method3();
	c.method5();
	
	A.method2();
	
	B.method2();
	B.method4();
	
	C.method2();
	C.method4();
	C.method6();

	}

}
