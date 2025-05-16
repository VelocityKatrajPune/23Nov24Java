package controlFlow;

public class ElseIfStudy {

	public static void main(String[] args) {
		
//		if(condition1)
//		{
//			
//		}
//		else if (condition2) 
//		{
//			
//		}
//		else if (condition3) 
//		{
//			
//		}
//		else {
//			
//		}
		
		
		//if signal is red then stop
		//else if signal is yellow then wait
		//else if signal is green then go
		
		String signal="black";
		
		if(signal=="red")
		{
			System.out.println("stop");
		}
		else if(signal=="yellow")
		{
			System.out.println("wait");
		}
		else if (signal=="green")
		{
			System.out.println("go");	
		}
		else {
			System.out.println("please enter red/ yellow/ green colour");
		}

		
//		if marks greater than 66 then its Dist
//		else if marks greater than 60 and less than 66 then its 1st class
//		else if marks greater than 55 and less than 60 then its 2nd class
//		else if marks greater than 40 then its pass class
//		else its fail
		
//		     AND   OR
//		0 0  0     0
//		0 1  0     1
//		1 0  0     1
//		1 1  1     1
		
		int marks=49;
		if(marks>66)
		{
			System.out.println("Disct");
		}
		else if (marks>60 && marks<66)
		{
			System.out.println("1st class");
		}
		else if(marks>55 && marks<60)
		{
			System.out.println("2nd class");
		}
		else if (marks>40)
		{
			System.out.println("pass class");
		}
		else 
		{
			System.out.println("fail");
		}
		
		
		
	}

}
