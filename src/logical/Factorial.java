package logical;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		// 5=5*4*3*2*1=120
		// 3=3*2*1=6

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number");
		int number = sc.nextInt();
		int fact = 1;
		for (int i = number; i >= 1; i--) {
			fact = i * fact;
			// 4=4*1;
			// 12=3*4;
			// 24=2*12;
			// 24=1*24;
		}
		System.out.println("factorial of " + number + " is " + fact);

	}

}
