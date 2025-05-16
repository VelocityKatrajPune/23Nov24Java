package demo;

public class A {

	public static void main(String[] args) {
		
	//	19.9876556788    float double
		
		//1.variable declartion
		//2.variable initialization--assign value
		//3.usage
		
		float a;
		a=19.9876556788f;
		System.out.println(a);
		
		double b=19.9876556788;
		System.out.println(b);
		
		
		//male-->M
		//Female-->F    AB+
		
		char gender;
		gender='F';
		
		
	//boolean-->	true  false
		// on off, pass fail, present absent

		
		//primitive-->8, keywords, memory size fix, lowercase
		// byte, short, int, long, float, double, char, boolean
		
		
		//non primitive-->userdefined, identifier
		//memory size->not fix, uppercase 
		// String Class
		
		String name="test";
		
		
		
	}
	
	// static regular method
	public static void sample1()
	{
		System.out.println("Sample 1 method from A class");
	}

	// non static regular method
	public void test1()
	{
		System.out.println("Test 1 method from A class");
	}
}
