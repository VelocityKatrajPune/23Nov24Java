package logical;

import java.util.Scanner;

public class CountNumberOfWhiteSpaces {

	public static void main(String[] args) {

		// String a=" Vel ocit y Pun e";
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter string");
		String a = sc.nextLine();

		int count = 0;

		for (int i = 0; i <= a.length() - 1; i++) {
			char temp = a.charAt(i);
			if (temp == ' ') {
				count++;
			}
		}

		System.out.println("Number of white spaces are " + count);
	}

}
