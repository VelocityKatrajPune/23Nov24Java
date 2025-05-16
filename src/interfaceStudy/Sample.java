package interfaceStudy;

public class Sample implements Demo {

	public static void main(String[] args) 
	{
		Sample s= new Sample();
		s.test1();
		s.test2();

	}

	@Override
	public void test1() {
		System.out.println("Test1 method completed in Sample class");
		
	}

	@Override
	public void test2() {
		System.out.println("Test2 method completed in Sample class");
		
	}

}
