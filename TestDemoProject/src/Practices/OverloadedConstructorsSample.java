package Practices;

public class OverloadedConstructorsSample {
	
	String bread;
	String sauce;
	String cheese;
	String toppings;
	
	
	OverloadedConstructorsSample(String bread, String sauce, String cheese, String toppings) {
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.toppings = toppings;
	}
	
	OverloadedConstructorsSample(String bread, String sauce, String cheese) {
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	OverloadedConstructorsSample(String bread, String sauce) {
		
		this.bread = bread;
		this.sauce = sauce;
	}
	OverloadedConstructorsSample(String bread) {
		this.bread = bread;
	}
	OverloadedConstructorsSample() {
		
	}
}
