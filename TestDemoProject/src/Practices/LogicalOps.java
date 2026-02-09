package Practices;

import java.util.Scanner;

public class LogicalOps {
	public static void main(String[] args) {
		//logical operators - used for two or more expressions that is connected
		
//		AND
		
//		int temp = 30;
//		
//		if (temp > 30) {
//			System.out.println("It is hot outsude!");
//		} else if (temp > 20 && temp <=30) {
//			System.out.println("It is warm outside");
//		} else {
//			System.out.println("It is cold outside");
//		}
		
		//OR
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("You're playing! Press q or Q to quit");
//		String response = scanner.next();
//		
//		if (response.equals("q") || response.equals("Q")) {
//			System.out.println("You quit the game!");
//		} else {
//			System.out.println("You're still playing!");
//		}
		
		//NOT
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("You're playing! Press q or Q to quit");
		String response = scanner.next();
		
		if (!response.equals("q") && !response.equals("Q")) {
			System.out.println("You're still playing!");
		} else {
			System.out.println("You quit the game!");
		}
	}

}
