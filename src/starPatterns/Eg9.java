package starPatterns;

public class Eg9 {

	public static void main(String[] args) {
		//    *
		//   ***
		//  *****
		// *******

		// row-->4   star-->1  space-->3
		int row=4;
		int star=1;
		int space=3;
		
		//outer for loop-->rows
		for(int i=1;i<=row;i++)
		{
			//inner for loop-->space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			//inner for loop-->star
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
			star=star+2;
			space--;
		}
		
	}

}
