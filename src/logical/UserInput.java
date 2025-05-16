package logical;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//num with decimal
		//num without decimal
		// char
		// string
		//Array
//		System.out.println("Please enter 1st number");
//		int a = sc.nextInt();
//		System.out.println("Please enter 2nd number");
//		int b = sc.nextInt();
//		
//		int sum=a+b;
//		
//		System.out.println("Sum is "+sum);
		
		System.out.println("==============================");
		
		System.out.println("Please enter your name");
		String name = sc.next();
		System.out.println("Please enter your surname");
		String surname = sc.next();
		
		System.out.println("My full name is "+name+" "+surname);
		
	

	}

}
