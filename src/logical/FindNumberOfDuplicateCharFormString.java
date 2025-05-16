package logical;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindNumberOfDuplicateCharFormString {

	public static void main(String[] args) {
		
		String a="xyzaxxccyyasdedfee";
	
		HashMap<Character,Integer>hm= new HashMap<Character, Integer>();
		
		for(int i=0;i<=a.length()-1;i++)
		{
			char temp = a.charAt(i);
			
			//hm
			//char     int
			//key      value
//x	          x         3    
//			  y			1
//			  z			1
//			  a			1
			  
		//get the previous value add 1--> hm.get(temp)+1,
		//put the new value	 put(temp,hm.get(temp)+1) 
			
			if(hm.containsKey(temp))
			{
				//get previous value add 1
				//put the new value
				hm.put(temp, hm.get(temp)+1);
			}
			else 
			{
				hm.put(temp, 1);
			}
			
		}
		System.out.println(hm);
		
		Set<Entry<Character, Integer>> hme = hm.entrySet();
		
		for(Entry<Character, Integer> e:hme)
		{
			//System.out.println(e);
			System.out.println(e.getKey()+": "+e.getValue());
		}
		
		System.out.println("Print those char which repeated more than 2 times");

		for(Entry<Character, Integer> e:hme)
		{
			if(e.getValue()>2)
			{
				System.out.println(e.getKey()+":"+e.getValue());
			}
		}
		
		
	}

}
