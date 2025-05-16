package arrayStudy;

import java.util.Arrays;

public class TraversingThroughArray {

	public static void main(String[] args) {
		
		int[] rollNum= new int[5];// Array declration
		
		//Array Initialization
		rollNum[0]=5;
		rollNum[1]=1;
		rollNum[2]=4;
		rollNum[3]=3;
		rollNum[4]=2;
		
		//Usage
		System.out.println(rollNum[0]);
		System.out.println(rollNum[1]);
		System.out.println(rollNum[2]);
		System.out.println(rollNum[3]);
		System.out.println(rollNum[4]);
		System.out.println("===============================");
		
		//for loop
		//initialization  condition updation
		//0    <=4   +1
		
		for(int i=0;i<=4;i++)//0,1,2,3,4,5
		{
			System.out.println(rollNum[i]);//0,1,2,3,4
			//5,1,4,..2
		}
		System.out.println("===============================");
		
		//Array Methods
		
		System.out.println(rollNum.length);
		System.out.println(rollNum.equals(rollNum));
		int[] newRollNum = rollNum.clone();
		System.out.println(newRollNum[2]);
		System.out.println("===============================");
		
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("===============================");

		for(int i=rollNum.length-1;i>=0;i--)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("===============================");
		
		Arrays.sort(rollNum);// we did sorting in Ascending order
		
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("===============================");
		
		//how to show in descending order
		for(int i=rollNum.length-1;i>=0;i--)
		{
			System.out.println(rollNum[i]);
		}
		
		System.out.println("=============================");
		
		String[] players= new String[5];
		
		players[0]="Zaheer";
		players[1]="Rahul";
		players[2]="Sachin";
		players[3]="Saurabh";
		players[4]="Yuvraj";
		
		for(int i=0;i<=players.length-1;i++)
		{
			System.out.println(players[i]);
		}
		System.out.println("=============================");
		
		Arrays.sort(players);
		
		//Ascending  0-->max Index
		
		for(int i=0;i<=players.length-1;i++)
		{
			System.out.println(players[i]);
		}
		System.out.println("=============================");
		
		for(int i=players.length-1;i>=0;i--)
		{
			System.out.println(players[i]);
		}
		
	}

}
