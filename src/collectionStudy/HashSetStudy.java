package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
		
		HashSet<String> hs= new HashSet<String>();
		hs.add("test");
		hs.add(null);
		hs.add(null);
		hs.add("VCTC");
		hs.add("VCTC");
		hs.add("Pune");
		
		System.out.println(hs);
		System.out.println(hs);
		//hs.clear();
		//hs.clone();
		System.out.println(hs.contains("test"));
		hs.isEmpty();
		hs.remove("Pune");
		System.out.println(hs);
		System.out.println(hs.size());
		
		System.out.println("=====Trversing through HashSet======");
		
		for(String h:hs)
		{
			System.out.println(h);
		}
		
		System.out.println("==========iterator=======");
		
		Iterator<String> it = hs.iterator();
		it.next();
		String expectedResult = it.next();
		System.out.println(expectedResult);
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
