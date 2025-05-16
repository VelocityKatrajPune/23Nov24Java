package exceptionStudy;

public class TryCatchStudy {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);//risky code
		}
		
		catch (ArithmeticException e) {
			System.out.println("We can not divide by zero");	
		}
		System.out.println("Good Morning");

	}

}
