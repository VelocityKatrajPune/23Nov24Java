package starPatterns;

public class Eg10 {

	public static void main(String[] args) {
        //	  *	
		//   * *
		//  * * *
		// * * * *
		
		//row-4 space-3 star-1
		int row=4;
		int space=3;
		int star=1;
		
		//outer for loop-->row
		for(int i=1;i<=row;i++)
		{
			//inner for loop-->space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			//inner for loop-->star along with space
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star++;
			space--;
		}
		

	}

}
