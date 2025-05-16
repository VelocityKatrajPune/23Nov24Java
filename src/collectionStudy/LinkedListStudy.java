package collectionStudy;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer>ll= new LinkedList<Integer>();
		ll.add(10);
		ll.add(null);
		ll.add(null);
		ll.add(11);
		ll.add(12);
		ll.add(10);
				
		System.out.println(ll);
		
		ll.add(3, 99);
		System.out.println(ll);
		
		ll.addFirst(1);
		ll.addLast(2);
		//ll.clear();
		ll.clone();
		ll.contains(1);
		ll.get(0);
		ll.getFirst();
		ll.getLast();
		ll.indexOf(99);
		ll.isEmpty();
		ll.offer(100);
		System.out.println(ll);
		ll.offerFirst(81);
		ll.offerLast(89);
		System.out.println(ll);
		
		System.out.println(ll.peek());
		System.out.println(ll);
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		
		System.out.println(ll.poll());
		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		System.out.println(ll.pollLast());
		System.out.println(ll);
		
		System.out.println(ll.size());
		ll.set(1, 77);
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		
		ll.push(23);
		System.out.println(ll);
		
		System.out.println(ll.remove());
		System.out.println(ll);
		
		ll.remove(3);
		System.out.println(ll);
		
		ll.remove(null);
		System.out.println(ll);
		
		//for?  for each?  iterator?  listiterator?
		
		//for loop
		
		//for each
		
		for(int l:ll)
		{
			System.out.println(l);
		}
		System.out.println("=====================");
		
		//iterator
		
		//listIterator
		
		ListIterator<Integer> li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
	}

}
