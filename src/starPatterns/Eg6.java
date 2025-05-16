package starPatterns;

public class Eg6 {

	public static void main(String[] args) {
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
		//row=5 col=5 star=5; space=0
		int row=5;
		int col=5;
		int star=5;
		int space=0;
		//outer for loop-->row
		for(int i=1;i<=row;i++)
		{
			//inner for loop-->col
			//space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			//star
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}

	}

}
