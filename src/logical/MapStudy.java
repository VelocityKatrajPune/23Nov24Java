package logical;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;



public class MapStudy {

	public static void main(String[] args) {
//		RTO-Passing      City
//		12				Pune
//		14              PCMC
//		31				Nagpur
//		16              Nagar
//		11              Satara
//		Key				value
//		Integer         String            

		
	HashMap<Integer, String> rtoDetails= new HashMap<Integer, String>();
	
	//LinkedHashMap<Integer, String> rtoDetails= new LinkedHashMap<Integer, String>();
		
	//TreeMap<Integer, String> rtoDetails= new TreeMap<Integer, String>();		
	System.out.println(rtoDetails);
	
	rtoDetails.put(12, "Pune");
	rtoDetails.put(14, "PCMC");
	rtoDetails.put(31, "Nagpur");
	rtoDetails.put(16, "Nagar");
	rtoDetails.put(11, "Satara");
	rtoDetails.put(50, "Karad");
	
	System.out.println(rtoDetails);
	
		
	System.out.println(rtoDetails.get(11));
	
	rtoDetails.put(12, "Mumbai");
	
	System.out.println(rtoDetails);
	
	rtoDetails.put(1, "Mumbai");
		
	System.out.println(rtoDetails);
	}

}
