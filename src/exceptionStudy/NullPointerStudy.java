package exceptionStudy;

public class NullPointerStudy {

	public static void main(String[] args) {

		String a = null;

		try {
			System.out.println(a.length());
		}

		catch (ArithmeticException e) {
			System.out.println("cant work on null values");
		}

		System.out.println("Pune City");

	}

}
