package stringStudy;

public class Test {

	public static void main(String[] args) {
		
		//1. 1st way to create String-->without new keyword
		String city="Pune";
		System.out.println(city);
		
		//2. 2nd way to create String--> with new keyword
		String name= new String("Velocity");
		System.out.println(name);
		System.out.println("==============================");
		
		
		
		String s="Pune";
		String s1="Pune";
		String s2="Mumbai";
		String s3="Pune";
		String s4="pune";
		
		
		String m1= new String("Velocity ");
		String m2= new String("Velocity");
		String m3= new String("Classes");
		String m4= new String("Pune");
		
		
		System.out.println(s==s1);//
		System.out.println(m1==m2);//
		System.out.println(s3==m4);	
		System.out.println(s3==s4);
		//String methods
		System.out.println("=========================");
		System.out.println(s.equals(s1));//
		System.out.println(m1.equals(m2));//
		System.out.println(s3.equals(m4));
		System.out.println(s3.equals(s4));
		
		System.out.println("===========================");
		
		String p1="Velocity";
		
		System.out.println(p1.length());
		
		String p2="";
		System.out.println(p2.length());
		
		String p3="    ";
		System.out.println(p3.length());
		
		String p4="Velociy  Pune ";
		System.out.println(p4.length());

	}

}
