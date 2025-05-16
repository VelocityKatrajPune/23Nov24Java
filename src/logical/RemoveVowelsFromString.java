package logical;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		String city = "Ujjain";// a,e,i,o,u
		String city1 = "";
		String lowerCaseCity = city.toLowerCase();
		for (int i = 0; i < lowerCaseCity.length(); i++) {
			char t = lowerCaseCity.charAt(i);
			if (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u') {
				continue;
			}
			city1 = city1 + t;

		}

		System.out.println(city1);

	}

}
