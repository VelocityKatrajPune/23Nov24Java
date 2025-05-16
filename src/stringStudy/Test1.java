package stringStudy;

public class Test1 {

	public static void main(String[] args) {
		
		
		String city="Pune";
		String city1 = city.concat(" MH");
		System.out.println(city);
		System.out.println(city1);
		System.out.println("======================");
		
		StringBuffer sb= new StringBuffer("Mumbai");
		System.out.println(sb);
		sb.append(" MH");
		System.out.println(sb);
		System.out.println("======================");
		
		StringBuilder sbd= new StringBuilder("Delhi");
		System.out.println(sbd);
		sbd.delete(1, 3);
		System.out.println(sbd);
		System.out.println("======================");
		
		StringBuffer sb1= new  StringBuffer("Velocity");
		
		sb1.insert(8, " classes");
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		System.out.println("======================");
		
		System.out.println(sb1.capacity());
		System.out.println(sbd.capacity());
		
		
	}

}
