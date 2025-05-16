package exceptionStudy;

public class IndexOutOfBoundStudy {

	public static void main(String[] args) {
		String a = "Pune";

		try {
			System.out.println(a.charAt(9));
		}

		catch (StringIndexOutOfBoundsException e) {
			System.out.println("check index");
		}

	}

}
