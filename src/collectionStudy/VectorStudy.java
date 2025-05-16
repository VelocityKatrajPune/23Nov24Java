package collectionStudy;

import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) 
	{
		Vector<Object> v= new Vector<Object>();
		
		v.add(100);
		v.add("Pune");
		v.add(12.2f);
		v.add(null);
		v.add(null);
		v.add("Pune");
		v.add(true);
		v.add('M');
		
		System.out.println(v);
		
		v.add(2, "Test");
		System.out.println(v);
		v.addFirst(12);
		v.addFirst(99);
		
		System.out.println(v.capacity());
		System.out.println(v);
		//v.clear();
		//v.clone();
		v.contains("Pune");
		System.out.println(v.elementAt(0));
		v.firstElement();
		v.lastElement();
		v.get(0);
		v.getFirst();
		v.getLast();
		System.out.println(v.indexOf("Pune"));
		v.isEmpty();
		v.remove(0);
		System.out.println(v);
		v.remove("Pune");
		System.out.println(v);
		System.out.println(v.size());
		v.set(0, 88);
		//v.setElementAt(0, 9);
		System.out.println(v);
		
	}

}
