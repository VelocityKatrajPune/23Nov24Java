package exceptionStudy;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		String a="hi";
		
		try {
			System.out.println(a.length());
			System.out.println(9/0);
			
		} 
		
		catch (NullPointerException e) {
			System.out.println("Cant work on null values");
		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Please check index");
		}
		
		catch (Exception e) 
		{
			System.out.println("Something went wrong");
		}
		
		
		finally {
			System.out.println("Welcome to Pune city");
	
		}
	

	}

}
