package Practices;

public class OverloadedConstructors {

	public static void main(String[] args) {
		// overloaded constructors - multiple constructors within a class with the same name
		// but have different parameters
		//name + parameters = signature

		OverloadedConstructorsSample pizza = new OverloadedConstructorsSample();
		
		System.out.println("Ingredients: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.toppings);
	
	}
}
