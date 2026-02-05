package Practices;

public class Break2 {
	public static void main(String[] args) {
		int [][] arrayofInts = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int searchFor = 0;
		int i;
		int j = 0;

		for (i=0; i<arrayofInts.length; i++) {
			for (j=0; j<arrayofInts[i].length; j++) {
				if (arrayofInts[i][j] == searchFor) {
					System.out.println(searchFor +
						" is at index " + i +
						", " + j);
					return;
				}
			}
		}
		
		System.out.println(searchFor + " not in the array");
		
	}
}