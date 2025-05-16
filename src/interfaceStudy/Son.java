package interfaceStudy;

public class Son implements Father, Mother {

	public static void main(String[] args) {
		
		Son s= new Son();
		s.look();//Mother
		s.nature();//Mother
		s.hardWork();//Father
		s.smart();//Father
		s.test();
		Mother.sample();
		Father.sample();

	}

	@Override
	public void look() {
		System.out.println("Mothers look, completed by Son");

	}

	@Override
	public void nature() {
		System.out.println("Mothers nature, completed by Son");

	}

	@Override
	public void hardWork() {
		System.out.println("Fathers hardwork, completed by Son");

	}

	@Override
	public void smart() {
		System.out.println("Fathers smartness, completed by Son");

	}

	@Override
	public void test() {
		
		Father.super.test();
		Mother.super.test();
		
	}





	
}
