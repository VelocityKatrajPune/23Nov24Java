package accessSpecifier;

public class Demo {

	public static void main(String[] args) {
		Demo d = new Demo();

		d.test1();
		d.test2();
		d.test3();
		d.test4();
	}

	public void test1() {
		System.out.println("public method test1 ");
	}

	protected void test2() {
		System.out.println("protected method test2 ");
	}

	void test3() {
		System.out.println("default method test3 ");
	}

	private void test4() {
		System.out.println("private method test4 ");
	}

}
