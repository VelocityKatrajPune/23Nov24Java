package arrayStudy;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		
		int[][] marks= new int[2][2];
		
		marks[0][0]=10;
		marks[0][1]=20;
		marks[1][0]=30;
		marks[1][1]=40;
		
		//outer for-->row, inner for loop-->columns
		//row--> 0-1  columns-->0-1
		//max value for row-->1,max value for column-->1
		
		//outer for loop-->row
		
		for(int i=0;i<=1;i++)//0,1
		{
			//inner for loop--> columns 0,1
			for(int j=0;j<=1;j++)
			{
				System.out.print(marks[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		
		
		String[][] players= {{"Sachin", "Veeru", "Saurabh"},{"VVS","Rahul","Yuvi"}};
		
		//nested for loop-->outer rows, inner columns
		//row-->0-1, col-->0-2
		
		//outer for loop-->row
		for(int i=0;i<=1;i++)
		{
			//inner for loop-->col
			for(int j=0;j<=2;j++)
			{
				System.out.print(players[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=================================");
		
		char[][]division= {{'A','B'},{'C','D'},{'E','F'}};
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(division[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
