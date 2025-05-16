package casting;

public class ImplicitExplicit {

	public static void main(String[] args) {
		
		
		byte a=10;
		System.out.println(a);
		
		int b=a;//10
		
		System.out.println(b);
		System.out.println("=============");
		//gold  1.111101     grosorry  float   sugar factory 10-12 int
		
		
		float c=19.999f;
		System.out.println(c);
		
		byte d=(byte)c;
		
		System.out.println(d);
		
		System.out.println("=============");
		
		int m=99;
		System.out.println(m);
		
		float n=m;
		System.out.println(n);
		System.out.println("=============");
		float p=99.99f;
		System.out.println(p);
		int q=(int)p;
		System.out.println(q);
	}

}
