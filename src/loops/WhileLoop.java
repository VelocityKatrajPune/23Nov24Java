package loops;

public class WhileLoop {

	public static void main(String[] args) {
		
		//initalization
//		while(condition)
//		{
//			//statement to be executed
//			//updation
//		}
		//I want to print Pune 10 times
		//initialization=1  condition<=10  increment= ++
		int i=1;//initialization
		while(i<=10)
		{
			System.out.println("Pune");
			i++;
		}
		System.out.println("========================");
		
		//I want to print table of 4
		//initialization=4   condition<=40   updation=+4
		int x=4;
		while(x<=40)//4,8,12,....36
		{
		System.out.println(x);//4,8,12,..36,40
			x=x+4;//8=4+4,  12=8+4,40, 44
		}
		System.out.println("========================");
		int z=1;
		while(z<=10)
		{
			System.out.println(99*z);
			z++;
		}
		System.out.println("========================");
		
		//I want to print table of 6 in reverse order
		//initialization=60       condition>=6     updation=decrement by 6
		
		int t=60;
		while(t>=6)
		{
			System.out.println(t);
			t=t-6;
		}
		
		
		
	}

}
