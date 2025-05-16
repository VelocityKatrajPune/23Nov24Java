package collectionStudy;

import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args) {
		
		TreeSet<Integer>ts= new TreeSet<Integer>();
		ts.add(5);
		ts.add(1);
		ts.add(3);
		ts.add(5);
		ts.add(2);
		ts.add(4);
		//ts.add(null);
		
		System.out.println(ts);
		System.out.println("==========================");
		TreeSet<String>ts1= new TreeSet<String>();
		ts1.add("Abhishek");
		ts1.add("Sanju");
		ts1.add("Tilak");
		ts1.add("Surya");
		ts1.add("Shivam");
		ts1.add("Hardik");
		
		System.out.println(ts1);
		
		System.out.println("==================================");
		
		TreeSet<Object> ts2= new TreeSet<Object>();
//		ts2.add(6);
//		ts2.add("Abhishek");
		
		
		ts.ceiling(7);
		
		System.out.println(ts);
		
		
		
		
		
	}

}
