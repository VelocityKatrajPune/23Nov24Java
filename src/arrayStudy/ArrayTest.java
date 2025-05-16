package arrayStudy;

public class ArrayTest {

	public static void main(String[] args) {
		
//		int[] runs=new int[10];
//
//		runs[0]=2;
		
		int[] runs= {22,44,55,66,77};
		
		System.out.println(runs.length);
		
		String[] name= {"test1","test2","test3","test4"};
		
		//System.out.println(name);
		
		for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		
		char[] div= {'A','B','C','D'};
		for(int i=div.length-1;i>=0;i--)
		{
			System.out.println(div[i]);
		}
		
	}

}
