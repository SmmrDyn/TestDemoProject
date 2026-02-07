package Practices;

import java.util.Scanner;

public class MathSample {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Side x: ");
		x = scanner.nextDouble();
		System.out.println("Side y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("Hypothenuse: " + z);
		
		scanner.close();
	}

}
