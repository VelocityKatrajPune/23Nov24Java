package loops;

public class ForLoop {

	public static void main(String[] args) {
		// I want to print Pune 10 times
		//initialization=1  condition<=10  increment= ++
		
//		for(intialization;condition;update)
//		{
//			
//		}
		for(int i=1; i<=10; i++ )
		{
			System.out.println("Pune");
		}
		System.out.println("========================");
		
		// I want to write table of 3   3-->30
		//Initialization=3  condition<=30  increment +3
		
		for(int a=3; a<=30;a=a+3)
		{
			System.out.println(a);
		}
		System.out.println("========================");
		// I want to write table of 5 in reverse order
		//Initialization=50  condition>=5 decrement -5
		for(int b=50;b>=5;b=b-5)
		{
			System.out.println(b);
		}
		
		System.out.println("========================");
		
		// I want to print Velocity 20 times
		//Initialization=1  condition<=20  increment ++
		for(int z=1; z<=20; z++)
		{
			//System.out.println(z);
			System.out.println("Velocity");
		}
		System.out.println("==========================");
		for(int i=1;i<=9;i++)
		{
			System.out.println(34*i);
		}
	}

}
