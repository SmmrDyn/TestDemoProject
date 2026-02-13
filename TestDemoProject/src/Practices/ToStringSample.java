package Practices;

public class ToStringSample {
	
	String make = "Ford";
	String model = "Mustang";
	String color = "Red";
	int year = 2021;
	
	
	//you can override the toString method to return a string representation of all the attributes
	public String toString() {
//		String myString = make + "\n" + model + "\n" + color + "\n" + year;
//		return myString;
		return make + "\n" + model + "\n" + color + "\n" + year;
	}

}
