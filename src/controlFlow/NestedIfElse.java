package controlFlow;

public class NestedIfElse {

	public static void main(String[] args) {

		// Please enter username
		// if username is correct then enter password
		// if password is correct then login successful
		// else enter correct password
		// else enter correct username

//		if(condition1)// outer if
//		{
//			if(condition2)
//			{
//				//inner if
//			}
//			else
//			{
//				
//			}
//		}
//		else
//		{
//			
//		}

		String username = "velocity";
		String password = "velocity@123";

		if (username == "velocity")
		{
			System.out.println("username is correct");
			System.out.println("enter password");

			if (password == "velocity@123") 
			{
				System.out.println("password correct");
				System.out.println("login successful");
			}

			else 
			{
				System.out.println("please enter correct password");
			}
		} 
		else 
		{
			System.out.println("please enter correct username");
		}

	}
	
	//please insert card
//if card is from same bank then enter pin
//if pin is correct then withdraw the cash
//else enter valid pin
//else please enter correct card

	String cardBank="SBI";
	int pin=1234;

}
