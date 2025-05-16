package interfaceStudy;

public class C extends Sample1 {

	public static void main(String[] args) {
	
		C c= new C();
		c.test1();
		c.test2();
		c.test3();
		

	}

	@Override
	public void test1() {
		System.out.println("test1 method completed in C class");
		
	}

	@Override
	public void test2() {
		System.out.println("test2 method completed in C class");
		
	}

}
