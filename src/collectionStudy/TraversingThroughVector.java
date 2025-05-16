package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TraversingThroughVector {

	public static void main(String[] args) {
	
		Vector<Integer> v= new Vector<Integer>();
		v.add(9);
		v.add(12);
		v.add(34);
		v.add(89);
		v.add(22);
		System.out.println("=======traversing using for loop========");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("=======traversing using for each loop========");
		
		for(int m:v)
		{
			System.out.println(m);
		}
		
		System.out.println("=======traversing using iterator========");
		
		Iterator<Integer> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=======traversing using List-iterator========");

		ListIterator<Integer> li = v.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("=======traversing using enumrator========");
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
