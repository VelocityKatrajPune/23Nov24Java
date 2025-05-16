package methods;

public class SPPU {

	public static void main(String[] args) {
		
		SPPU sppu= new SPPU();
		sppu.studentInfo();
		sppu.studentInfo();
		sppu.studentInfo("Yogendra", 789, 'A', 8.8f, "E&TC", true);
		sppu.studentInfo("Ajit", 10, 'C', 90, "Mech", true);
		
		
	}
	//name, rollNum, div, Marks, branch, passStatus
	public void studentInfo()// non static without parameter
	{
		String name="Mahesh";
		int rollNum=123;
		char div='B';
		float marks=99.9f;
		String branch="Civil";
		boolean passStatus=true;   //boolean--> true, false    //pass fail
		
		System.out.println("================================");
		System.out.println("Student name is "+name);
		System.out.println("Student roll num is "+rollNum);
		System.out.println("Student div is "+div);
		System.out.println("Student marks are "+marks);
		System.out.println("Student branch is "+branch);
		System.out.println("Student pass status is "+passStatus);
		System.out.println("================================");
		}
	
	//name, rollNum, div, Marks, branch, passStatus
	
	public void studentInfo(String name, int rollNum, char div, float marks, String branch, boolean passStatus)
	{
		System.out.println("================================");
		System.out.println("Student name is "+name);
		System.out.println("Student roll num is "+rollNum);
		System.out.println("Student div is "+div);
		System.out.println("Student marks are "+marks);
		System.out.println("Student branch is "+branch);
		System.out.println("Student pass status is "+passStatus);
		System.out.println("================================");
	}
	
}
