package logical;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindNumberOfDuplicateStringFormString {

	public static void main(String[] args) {
		String a = "abc pqr abc xyz abc xyz lmn";
		String[] ar = a.split(" ");// ["abc","pqr","abc","xyz","abc","xyz","lmn"]
		// ar[1]
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (int i = 0; i <= ar.length - 1; i++) {
			String temp = ar[i];
			if (hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp) + 1);
			} else {
				hm.put(temp, 1);
			}
		}

		System.out.println(hm);

		Set<Entry<String, Integer>> hme = hm.entrySet();
		for (Entry<String, Integer> e : hme) {
			System.out.println(e.getKey() + ":" + e.getValue());
		}

		System.out.println("print unique strings");
		for (Entry<String, Integer> e : hme) {
			if (e.getValue() == 1) {
				System.out.println(e.getKey() + ":" + e.getValue());
			}
		}

	}

}
