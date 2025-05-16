package logical;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String a = "listen";//
		String b = "silent";//

		// convert String to char array
		char[] a1 = a.toCharArray();// ['l','i','s','t','e','n']
		char[] b1 = b.toCharArray();// ['s','i','l','e','n','t']

		// sort
		Arrays.sort(a1);// ['e','i','l','n','s','t']
		Arrays.sort(b1);// ['e','i','l','n','s','t']

		boolean result = Arrays.equals(a1, b1);

		if (result) {
			System.out.println("String is anagram");
		} else {
			System.out.println("String is not anagram");
		}

	}

}
