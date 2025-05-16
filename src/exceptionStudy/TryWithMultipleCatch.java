package exceptionStudy;

public class TryWithMultipleCatch {

	public static void main(String[] args) {
		
		String a=null;
		
		try {
			
			System.out.println(a.charAt(9));
		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Please check index");
		}
		
		catch (NullPointerException e) {
			System.out.println("Cannt work on null values");
		}
		
		catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Welcome to Pune");

	}

}
