package logical;

public class FibonacciSeries {

	public static void main(String[] args) {
		//0,1
		//0+1=1
		//1+1=2
		//1+2=3
		//2+3=5
		
		int count=20;
		int n1=0;
		int n2=1;
		int sum=0;
		
		for(int i=1;i<=count;i++)
		{
			System.out.print(n1+" ");
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		}

	}


