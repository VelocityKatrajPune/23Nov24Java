package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraversingInArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		
		al.add("Abhishek");
		al.add("Sanju");
		al.add("Tilak");
		al.add("Surya");
		al.add("Hardik");
		al.add("Akshar");
		
		System.out.println(al);
		
		//for loop
		System.out.println("======Traversing using for loop====");
		for(int i=0; i<=al.size()-1;i++)//0,1
		{
			System.out.println(al.get(i));
		}
		
		
		//for each
		System.out.println("======Traversing using for each loop====");
		
		for(String a:al)
		{
			System.out.println(a);
		}
		System.out.println("======Traversing using iterator =====");
		Iterator<String> it = al.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("====Traversing using list-Itartor===========");
		ListIterator<String> li = al.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println(al.set(1, "Gill"));
		System.out.println(al);
		
	}

}
