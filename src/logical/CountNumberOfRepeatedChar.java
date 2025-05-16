package logical;

import java.util.Scanner;

public class CountNumberOfRepeatedChar {

	public static void main(String[] args) {

		//String a = "engineering";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a String");
		String a=sc.next();
		// find how many times char 'e' is repeated
		int count = 0;

		for (int i = 0; i <= a.length() - 1; i++) {

			if (a.charAt(i) == 'e') {
				count++;
			}
		}

		System.out.println("Number of 'e' are " + count);

	}

}
