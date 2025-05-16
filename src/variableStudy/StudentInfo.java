package variableStudy;

public class StudentInfo {

	public static void main(String[] args) {
		//name, rollNum, age, div, gender, attendence status
		
		//variable declration
		String name;
		int rollNum;
		float age;
		char div;
		char gender;
		boolean attendece;
		
		//variable initialzation
		name="Velocity";
		rollNum=22;
		age=23.5f;
		div='B';
		gender='M';
		attendece=true;
		
		//usage
		System.out.println("===============================");
		System.out.println("My name is "+name);
		System.out.println("My roll Num is "+rollNum);
		System.out.println("My age is "+age);
		System.out.println("My div is "+div);
		System.out.println("My gender is "+gender);
		System.out.println("My attendence status is "+attendece);
		System.out.println("===============================");
	}

}
