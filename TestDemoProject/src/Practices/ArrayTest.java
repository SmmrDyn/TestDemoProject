package Practices;

public class ArrayTest {
	public static void main(String[] args) {
		int array[] = {
			100, 200, 300,
			400, 500, 600,
			700, 800, 900,
			1000
		};
		
		for (int eachArray : array) {
			System.out.println(eachArray + " ");
		}
	}
}