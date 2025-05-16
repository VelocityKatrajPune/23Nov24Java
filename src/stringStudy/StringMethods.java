package stringStudy;

public class StringMethods {

	public static void main(String[] args) {

		String a1 = "Pune";
		String a2 = "Mumbai";

		// String Class Methods:
		// 1. equals()

		System.out.println(a1.equals(a2));
		boolean result = a1.equals(a2);
		System.out.println(result);
		System.out.println("=========================");

		// equalsIgnoreCase()
		String a3 = "velocity";
		String a4 = "Velocity";
		System.out.println(a3.equals(a4));

		System.out.println(a3.equalsIgnoreCase(a4));

		// 2. length()

		String b1 = "Velocity";
		int result1 = b1.length();
		System.out.println(result1);

		String b2 = "Velocity     Pune   ";
		System.out.println(b2.length());
		System.out.println("=========================");

//		3. touppercase()
//		4. toLowerCase()

		String c1 = "prayagraj";
		System.out.println(c1.toUpperCase());

		String result2 = c1.toUpperCase();
		System.out.println(result2);

		System.out.println(result2.toLowerCase());
		System.out.println("=========================");

		// 5.contains()

		String d1 = "Test";
		System.out.println(d1.contains("e"));
		System.out.println(d1.contains("z"));
		boolean result3 = d1.contains("st");
		System.out.println(result3);
		System.out.println(d1.contains("et"));
		System.out.println(d1.contains("te"));
		// System.out.println(d1.contains("ee"));
		System.out.println("=========================");

		// 6.isEmpty()
		// true in case of zero length only
		String e1 = "Software";
		String e2 = "";
		String e3 = "  ";

		System.out.println(e1.isEmpty());
		System.out.println(e2.isEmpty());
		System.out.println(e3.isEmpty());
		// 7.Returns true if the string is empty or contains only white space
		System.out.println(e1.isBlank());
		System.out.println(e2.isBlank());
		System.out.println(e3.isBlank());
		System.out.println("=========================");

		// 8.charAt

		String f1 = "Hinjewadi";

		char result4 = f1.charAt(1);
		System.out.println(result4);
		// System.out.println(f1.charAt(15));
		//System.out.println(f1.charAt(-2));
		System.out.println("=========================");

		//9.endsWith
		String g1="Punecity"; // un
		System.out.println(g1.endsWith("city"));
		System.out.println(g1.endsWith("ne"));
		System.out.println(g1.endsWith("City"));
		System.out.println(g1.endsWith("cty"));
		System.out.println("=========================");

		//10.startsWith
		String g2="Punecity";
		System.out.println(g2.startsWith("Pune"));
		System.out.println(g2.startsWith("une"));
		System.out.println(g2.startsWith("city"));
		System.out.println(g2.startsWith("city", 4));
		System.out.println(g2.startsWith("eci",3));
		System.out.println("=========================");
		
	//	11. substring
		
		String g3="Punecity";
		
		String g4 = g3.substring(4);
		System.out.println(g4);
		
		String g5="Software Testing";
		System.out.println(g5.substring(9));
		
		String g6="Velocity Training Center";
		System.out.println(g6.substring(9));
		//Training
		System.out.println(g6.substring(9, 16));
		System.out.println(g6.substring(9, 17));
		System.out.println("=========================");
		
	//	12. concat
		
		String h1="Velocity";
		String h2="Classes";
		System.out.println(h1+h2);
		System.out.println(h1.concat(h2));
		
		System.out.println(h1.concat(h2).concat("Pune"));
		
		String h3 = h1.concat(" ").concat(h2).concat(" ").concat("Pune");
		System.out.println(h3);
		System.out.println("=========================");

	//13. indexOf
	//14.lastIndexOf
		
		String i1="testing";
		
		System.out.println(i1.indexOf('e'));
		System.out.println(i1.indexOf('g'));
		System.out.println(i1.indexOf('t'));
		System.out.println(i1.lastIndexOf('t'));
		
		String i2="engineering";
		System.out.println(i2.indexOf('g'));
		System.out.println(i2.lastIndexOf('g'));
		System.out.println(i2.indexOf('e'));
		System.out.println(i2.lastIndexOf('e'));
		System.out.println(i2.indexOf('e', 4));
		System.out.println("=========================");

		
		//15. replace
		
		String j1="testing";
		
		System.out.println(j1.replace('t', 'm'));
		
		String j2="engineering";
		
		System.out.println(j2.replace("ng", "ist"));
		
		String j3="moring";
		System.out.println(j3.replace("mo", ""));
		System.out.println("===============================");
		
		
		String z1="Pune";
		String z2="Pune";
		System.out.println(z1==z2);
		
		
		
		
		
		
	}

}
