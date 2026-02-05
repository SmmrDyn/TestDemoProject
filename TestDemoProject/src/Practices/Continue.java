package Practices;

public class Continue {
	public static void main(String[] args) {
		String toSearch = "peter piper picked a " +
			"peck of pickled peppers";
		int max = toSearch.length();
		int numP = 0;
		
		for (int i = 0; i < max; i++) {
			if (toSearch.charAt(i) != 'p') {
				continue;
			}
			numP++;
		}
		
		System.out.println("P: " + numP);
	}
}