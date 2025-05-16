package logical;

import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number...");
		int number = sc.nextInt();

		if (number == 0) {
			System.out.println("Enter valid number");
		} else if (number % 2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Numbe is odd");
		}

	}

}
