package Practices;

public class ToString {

	public static void main(String[] args) {
		// toString - special method that all objects inherit
		//			that returns a string that textually represents an object
		//			can be used both implicitly and explicitly
		
		ToStringSample car = new ToStringSample();
		
//		System.out.println(car); //address of the car object in the memory
		
//		System.out.println(car.toString()); //explicitly
		
		System.out.println(car); //implicitly
	}

}
