package logical;

public class FindPalindrome {

	public static void main(String[] args) {
		String originalString = "madam";// mom, dad, madam, radar, nitin, nayan
		String revString = "";

		for (int i = originalString.length() - 1; i >= 0; i--) {
			char temp = originalString.charAt(i);
			revString = revString + temp;
		}

		System.out.println("given string is " + originalString);
		System.out.println("reverse string is " + revString);

		if (originalString.equals(revString)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
