package Practices;

public class OOP2 {

	public static void main(String[] args) {
		// constructor - special method that is called when an object is instantiated(created)
		
		OOP2Human human1 = new OOP2Human("Rick", 65, 50);
		OOP2Human human2 = new OOP2Human("Summer", 24, 59);
		
//		System.out.println(human2.name);
		
		human1.eat();
		human2.drink();

	}

}
