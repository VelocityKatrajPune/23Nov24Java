package interfaceStudy;

public interface Mother 
{
	
	void look();
	void nature();
	default void test()
	{
		System.out.println("Mothers test method");
	
	}
	static void sample()
	{
		System.out.println("Mothers static sample method");
	}
	

}
