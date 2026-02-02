package Practices;

public class Comparison {
	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;
		
		if(value1 == value2) {
			System.out.println(value1 + " == " + value2);
		} else {
			System.out.print("False \n");
		}
		
		if(value1 != value2) {
			System.out.println(value1 + " != " + value2);
		} else {
			System.out.print("False");
		}
	
		if(value1 > value2) {
			System.out.println(value1 + " > " + value2);
		} else {
			System.out.print("False \n");
		}
		
		if(value1 < value2) {
			System.out.println(value1 + " < " + value2);
		} else {
			System.out.print("False");
		}
	}
}