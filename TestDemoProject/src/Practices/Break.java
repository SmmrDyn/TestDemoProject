package Practices;

public class Break {
	public static void main(String[] args) {
		int [] arrayofInts =
			{
				1, 2 ,3, 4, 5
			};
		int searchFor = 2;
		int i;
		boolean foundIt = false;
		
		for (i = 0; i < arrayofInts.length; i++) {
			if ( arrayofInts[i] == searchFor) {
				foundIt = true;
				break;
			}
		}
		
		if (foundIt) {
			System.out.println(searchFor +
				" is at index " + i);
		} else {
			System.out.println(searchFor +
				" not in the array.");
		}
			
	}
}