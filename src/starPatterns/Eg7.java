package starPatterns;

public class Eg7 {

	public static void main(String[] args) {
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		//row=5   col=5 space=4 star=1
		int row=5;
		int col=5;
		int space=4;
		int star=1;
		//outer for loop-->row
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
			space--;
			star++;
			
		}
		

	}

}
