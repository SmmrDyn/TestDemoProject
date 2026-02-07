package Practices;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int age;
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		
		if (age >=75) {
			System.out.println("BOOMER");
		}
		else if (age >=18) {
			System.out.println("You're an adult.");
		}
		else if (age >= 13) {
			System.out.println("Teenager");
		}
		else {
			System.out.println("You're minor!");
		}
		
		
	}

}
