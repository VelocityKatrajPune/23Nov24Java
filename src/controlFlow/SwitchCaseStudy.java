package controlFlow;

public class SwitchCaseStudy {

	public static void main(String[] args) {
		
//		1 : I am in 1st year
//		2 : I am in 2nd year
//		3 : I am in 3rd year
//		4 : I am in 4th year
		
		
		int year=22;//key
			
		switch (year) {
		case 1:System.out.println("I am in 1st year");
		break;
		
		case 2 :System.out.println("I am in 2nd year");
		break;
		
		case 3:System.out.println("I am in 3rd year");
		break;
		
		case 4:System.out.println("I am in 4th year");
		break;
		
		default:System.out.println("please enter year between 1 to 4");
		break;
		}
		
		//MON TUE WED THU FRI SAT SUN
		
		String day="SUN";// key
		
		switch(day)
		{
		case "MON": System.out.println("Today is Monday");
		break;
		
		case "TUE": System.out.println("Today is Tuesday");
		break;
		
		case "WED":System.out.println("Today is Wednesday");
		break;
		
		case "THU" :System.out.println("Today is Thursday");
		break;
		
		case "FRI" :System.out.println("Today is Friday");
		break;
		
		case "SAT" :System.out.println("Today is Saturday");
		break;
		
		case "SUN" :System.out.println("Today is Sunday");
		break;
		
		default:System.out.println("Please enter valid days");
		break;
		}
		
	
//		M-->My gender male
//		F-->My gender is Female
		
		char gender='M';// key
		
		switch(gender)
		{
		case 'M':System.out.println("My gender is male");
		break;
		
		case 'F':System.out.println("My gender is Female");
		break;
		
		default:System.out.println("Please enter valid gender");
		break;
		}
		
		
		
		
		
//		//1--> Jan
//		//2

//		12--> Dec
		
		
		
		//RED YELLOW GREEN
		
		
	}

	
	
	
	
	
	
	
}
