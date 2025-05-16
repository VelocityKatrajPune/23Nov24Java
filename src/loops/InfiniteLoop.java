package loops;

public class InfiniteLoop {

	public static void main(String[] args) {
		
		//1--10
		//initialization=1  condition<=10  increment= ++
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("====================");
		
//		for(;;)
//		{
//			System.out.println("Pune");
//		}
		
		System.out.println("====================");
		//1--10
		//initialization=1  condition<=10  increment= ++
		int a=1;
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}
		System.out.println("====================");
		//1--10
		//initialization=1  condition<=10  increment= ++
		int c=1;
		do
		{
			System.out.println(c);
			c++;
		}while(c<=10);
		
		
	}

}
