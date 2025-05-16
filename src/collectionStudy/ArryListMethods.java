package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArryListMethods {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(4, 10);// add element at specific index
		
		System.out.println(al);
		al.addFirst(100);
		System.out.println(al);
		al.addLast(90);
		System.out.println(al);
		
		System.out.println("=============================");
		System.out.println(al);
	//	al.clear();
		System.out.println(al);
		
		Object al1 = al.clone();
		
		System.out.println(al1);
		
		boolean result = al.contains(90);
		System.out.println(result);
		
		System.out.println(al.get(5));
		
		//System.out.println(al.get(15));
		
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		
		System.out.println(al.indexOf(100));
		
		System.out.println(al.indexOf(50));
		
		System.out.println(al.isEmpty());
//		al.clear();
//		System.out.println(al.isEmpty());
		
	//	al.lastIndexOf(al1);
		
		al.add(100);
		
		System.out.println(al);
		System.out.println(al.indexOf(100));
		System.out.println(al.lastIndexOf(100));
		
		System.out.println(al.remove(5));
		System.out.println(al);
		//System.out.println(al.remove(10));
		
		
	ArrayList<String>als= new ArrayList<String>();
	
	als.add("Pune");
	als.add("Mumbai");
	als.add("Nagpur");
	als.add("Delhi");
	
	
	System.out.println(als);
	
	als.remove(1);
	System.out.println(als);
	als.remove("Delhi");
	System.out.println(als);
	
	System.out.println(al.size());
	
	System.out.println("=============================");
	System.out.println(al);
	al.set(2, 60);
	//System.out.println(al.set(2, 60));
	System.out.println(al);
	
	for(int a:al)
	{
		System.out.println(a);
	}
	System.out.println("=========================");
		
	Iterator<Integer> it = al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("======list iterator===========");
	
	
	}

}
