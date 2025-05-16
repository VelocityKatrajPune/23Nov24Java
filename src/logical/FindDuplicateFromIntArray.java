package logical;

public class FindDuplicateFromIntArray {

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 5, 6, 1, 8, 3, 4, 2 };
		int count = 0;
		System.out.print("duplicate numbers are: ");

		for (int i = 0; i <= ar.length - 1; i++)// 0
		{
			for (int j = i + 1; j <= ar.length - 1; j++) {
				if (ar[i] == ar[j]) {
					System.out.print(ar[i] + " ");
					count++;
				}
			}
		}

		System.out.println();
		System.out.println("number of duplicate are " + count);
	}

}
