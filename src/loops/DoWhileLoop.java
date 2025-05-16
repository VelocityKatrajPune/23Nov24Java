package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		
//		do
//		{
//			//statement to be executed
//			// updation
//		}while(condition);
		
		//I want to print pune 10 times
		// initialization=1  condition<=10   updation=++
		int i=1;//initialization
		do
		{
		  System.out.println("Pune");
		  i++;//updation, 2,3...9,10,11
		}while(i<=10);
		System.out.println("=========================");
		
		//I want print table of 7 using do while loop
		//initalization=7    condition<=70    update+7
		
		int a=7;
		do 
		{
			System.out.println(a);
			a=a+7;
		}while(a<=70);
		System.out.println("=========================");
	
		//I want table of 9 in reverse order
		//initalization=90    condition>=9  update-9
		int b=90;
		do
		{
			System.out.println(b);
			b=b-9;
		}while(b>=9);
		
		
		
	}

}
