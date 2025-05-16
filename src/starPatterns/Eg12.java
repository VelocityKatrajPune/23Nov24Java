package starPatterns;

public class Eg12 {

	public static void main(String[] args) {
		// *****
		// ****
		// ***
		// **
		// *
		// **
		// ***
		// ****
		// *****
		
		//star=5    row=9
		
		int row=9;
		int star=5;
		//outer for loop--rows
		for(int i=1;i<=row;i++)
		{
			//inner for loop--> columns-->star
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<5)
			{
				star--;
			}
			else {
				star++;
			}
			
		}
		
		
	}

}
