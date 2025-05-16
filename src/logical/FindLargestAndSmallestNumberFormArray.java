package logical;

import java.util.Arrays;

public class FindLargestAndSmallestNumberFormArray {

	public static void main(String[] args) {
		
		int ar[]= {22,11,66,33,99,88,55};
		Arrays.sort(ar);
		
		System.out.println("largest number is "+ar[ar.length-1]);
		System.out.println("2nd largest number is "+ar[ar.length-2]);
		System.out.println("smallest number is "+ar[0]);
		System.out.println("2nd smallest number is "+ar[1]);

	}

}
