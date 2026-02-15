package Encapsulation;

public class Main {

	public static void main(String[] args) {
		// encapsulation - attributes of a class will be hidden or private
		// can be accessed only through methods (getters & setters)
		// you should make attributes private if you don't have a reason to make them public/protected
		
		Car car = new Car("Chevrolet", "Camaro", 2021);
		
		//set new year
		car.setYear(2022);
		
		System.out.println(car.toString());
		
	}

}
