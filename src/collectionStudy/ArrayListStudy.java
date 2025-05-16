package collectionStudy;

import java.util.ArrayList;

public class ArrayListStudy {

	public static void main(String[] args) {
		
	 ArrayList al= new ArrayList();
	 
	 al.add(10);
	 al.add("Velocity");
	 al.add(12.5f);
	 al.add('A');
	 al.add(true);
	 al.add("Velocity");
	 al.add(null);
	 al.add(null);
	 al.add(null);
	 al.add("Pune");
	 al.add("Mumbai");
	 
	 
	 System.out.println(al);
	 
	 
	 ArrayList<Integer> al1= new ArrayList<Integer>();
	 
	 al1.add(1);
	// al1.add("Pune");
	 
	 ArrayList<String>al3= new ArrayList<String>();
	 al3.add("Pune");
	 
	 
	 ArrayList<Object> al2= new ArrayList<Object>();
	 al2.add("Test");
	 al2.add(123);
	 al2.add('A');
	 
	 
	}

}
