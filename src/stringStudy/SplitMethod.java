package stringStudy;

public class SplitMethod {

	public static void main(String[] args) {
		
		
		String a="I love my India";// regex=space
		String[] a1 = a.split(" ");
		
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println(a1[i]);
		}
		
		System.out.println(a1[3]);
		
		String test = a1[3];
		a1[3]=test.replace("India", "Bharat");
		
		
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println(a1[i]);
		}
		
		
		String b="This_is_My_Office";
		//office-->workSpace

	}

}
