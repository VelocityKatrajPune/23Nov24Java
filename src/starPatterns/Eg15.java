package starPatterns;

public class Eg15 {

	public static void main(String[] args) {
		//    *
		//   ***
		//  *****
		// *******
		//  *****
		//   ***
		//    *
		
		// row=7   star=1 space=3
		int row=7;
		int star=1;
		int space=3;
		//outer for loop-->rows
		for(int i=1;i<=row;i++)
		{
			//inner for loop
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<4)
			{
				star=star+2;
				space--;
			}
			else
			{
				star=star-2;
				space++;
			}

		}
		
	}

}
