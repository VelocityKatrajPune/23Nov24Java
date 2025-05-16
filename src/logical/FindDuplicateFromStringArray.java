package logical;

public class FindDuplicateFromStringArray {
	public static void main(String[] args) {

		String ar[] = { "java", "API", "selenium", "Testing", "java", "api", "sql", "SQL", "testing" };
		int count = 0;
		System.out.print("duplicate strings are: ");

		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i].equalsIgnoreCase(ar[j])) {
					System.out.print(ar[i] + " ");
					count++;
				}
			}
		}

		System.out.println();
		System.out.println("Total duplicate count is " + count);
	}

}
