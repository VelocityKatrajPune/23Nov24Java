package collectionStudy;

import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lhs= new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(10);
		lhs.add(10);
		lhs.add(null);
		lhs.add(null);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		
		System.out.println(lhs);
		
		lhs.addFirst(11);
		lhs.addLast(99);
		
		//lhs.clear();
		lhs.clone();
		lhs.contains(77);
		lhs.getFirst();
		lhs.getLast();
		lhs.isEmpty();
		lhs.remove(10);
		lhs.size();
		
		
		
		//for each?
		//iterator
		
		

	}

}
