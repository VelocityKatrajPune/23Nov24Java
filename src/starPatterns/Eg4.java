package starPatterns;

public class Eg4 {

	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		
// row-->5, col-->5, 1st row star-->1
		
		int row=5;
		int col=5;
		int star=1;
		
		//outer for loop-->rows, inner for loop-->columns
		
		for(int i=1;i<=row;i++)//1-row1,2-row2
		{
			//inner for loop-->columns
			for(int j=1;j<=star;j++)//star1
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		

	}

}
