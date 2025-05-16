package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Vector;

public class CursorStudy {

	public static void main(String[] args) 
	{
	
		Vector<Integer>v= new Vector<Integer>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		v.add(70);
		
		
		//iterator  list-Iterator, enumrator
		
		Iterator<Integer> it = v.iterator();
		
//		while(it.hasNext())//unidirectional, next position only
//		{
//			System.out.println(it.next());//read and remove
//		}
		System.out.println(v);

		System.out.println(it.next());
		it.remove();//remove opeartion
		System.out.println(v);
		System.out.println("=====================================");
		
		
		//list-Iterator
		
		ListIterator<Integer> li = v.listIterator();
		
		while(li.hasNext())//bidirectional cursor, read, write, remove
		{
			System.out.println(li.next());//read
		}
		System.out.println("========");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		li.remove();//remove
		
		System.out.println(v);
		
		li.add(20);//write
		
		System.out.println(v);
		
		//enumrator
		
		Enumeration<Integer> ele = v.elements();
		
		ele.hasMoreElements();// forward direction only--> unidirectioanal 
		
		ele.nextElement();//read only cursor
		
		
		PriorityQueue<Integer>pq= new PriorityQueue<Integer>();
		
	}

}
