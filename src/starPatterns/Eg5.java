package starPatterns;

public class Eg5 {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		
		//row=5    col=5    star=5
		int row=5;
		int col=5;
		int star=5;
		
		//outer for loop-->row
		for(int i=1;i<=row;i++)
		{
			//inner for loop->col
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
		}
		

	}

}
