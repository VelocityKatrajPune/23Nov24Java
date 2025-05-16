package logical;

public class ReverseString {

	public static void main(String[] args) {

		String a = "velocity"; // yticolev
		String rev = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			char temp = a.charAt(i);// y
			rev = rev + temp;
//			rev=""+y;  //y
//			rev=y+t//yt
//			rev=yt+i//yti	
		}

		System.out.println("given string is " + a);
		System.out.println("reverse of given string is " + rev);

	}

}
