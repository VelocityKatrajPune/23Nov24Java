package exceptionStudy;

public class TryFinally {

	public static void main(String[] args) {
		
		String a=null;
		
		try {
			System.out.println(a.charAt(9));
			
		} 
		finally {
			System.out.println("running finally block");	
		}
		
		
	}

}
