package interfaceStudy;

public interface Father {
	
	void hardWork();
	void smart();
	default void test()
	{
		System.out.println("Fathers test method");
	}
	
	static void sample()
	{
		System.out.println("Fathres static sample method");
	}

}
