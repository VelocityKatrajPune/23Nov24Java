package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Mother m= new Mother();
		
		m.look();
		Mother.nature();
		
		Son s= new Son();
		s.laptop();
		s.look();
		Son.nature();
		Son.mobile();
		
		Daughter d= new Daughter();
		d.scooty();
		d.look();
		Daughter.nature();
		Daughter.bag();
	
	}

}
