package starPatterns;

public class Eg3 {

	public static void main(String[] args) {
		// * * * * *
		// * * * * *
		// * * * * *
		
		
	//row-->3     columns-->5		//num of stars in 1st row-->5
		
		int row=3;
		int col=5;
		int star=5;
		
		//nested for loop-->rows, columns
		//outer for loop--> rows      inner for loop-->columns
		
		//outer for loop-->rows
		for(int i=1;i<=row;i++)
		{
			//inner for loop-->columns
			for(int j=1;j<=col;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
