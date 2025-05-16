package polymorphism;

public class MethodOverRiding {

	public static void main(String[] args) {
		
		A a = new A();
		a.sample();
		a.demo();
		a.display();
		
		
		B b = new B();
		b.sample();
		b.demo();
		b.display();
		
		System.out.println("==================");
		
		a.demo();
		
		
		
		
		
	}

}
