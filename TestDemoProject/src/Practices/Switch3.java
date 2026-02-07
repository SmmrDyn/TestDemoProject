package Practices;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String day;
		System.out.println("Enter day: ");
		day = scanner.nextLine();
		
		switch (day) {
		case "Sunday" : System.out.println("Today is Sunday");
		break;
		case "Monday" : System.out.println("Today is Monday");
		break;
		case "Tuesday" : System.out.println("Today is Teusday");
		break;
		case "Wednesday" : System.out.println("Today is Wednesday");
		break;
		case "Thursday" : System.out.println("Today is Thursday");
		break;
		case "Friday" : System.out.println("Today is Friday");
		break;
		case "Saturday" : System.out.println("Today is Saturday");
		break;
		default : System.out.println("Not a day!");
		}

	}

}
