package test;

import accessSpecifier.Demo;
//import accessSpecifier.*;

public class Demo2 extends Demo {

	public static void main(String[] args) 
	{
	
		Demo d= new Demo();
		d.test1();//public method
	//	d.test2();
		//protected method test2 cant be called, access is restricted within same package
		//default method test3 cant be called, access is restricted within same package
		//private method test4 cant be called, access is restricted within same class
		
		Demo2 d2= new Demo2();
		d2.test2();//protected method test2 is accesible in another package
		//with one condition-->inheritance
		//need to create sub class object
		
		
	}

}
