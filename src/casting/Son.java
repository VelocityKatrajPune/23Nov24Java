package casting;

public class Son extends Father
{

	public static void main(String[] args) {
		
		Father f= new Father();
		f.education();
		f.fourWheeler();
		System.out.println("=============");
		Son s= new Son();
		s.education();
		s.fourWheeler();
		s.bike();
		System.out.println("=============");
			
		Father f1= new Son();
		f1.education();
		f1.fourWheeler();
	//	f1.bike();
	}
	
	public void education()
	{
		System.out.println("BE");
	}
	
	public void fourWheeler()
	{
		System.out.println("Audi");
	}
	
	public void bike()
	{
		System.out.println("bullet");
	}

}
