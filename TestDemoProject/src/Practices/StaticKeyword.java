package Practices;

public class StaticKeyword {

	public static void main(String[] args) {
		// static - modifier
		//			a single copy of a variable/method is created and shared.
		//			the class "owns" the static member
		
		StaticKeywordSample friend1 = new StaticKeywordSample("SpongeBob");
		StaticKeywordSample friend2 = new StaticKeywordSample("Patrick");
		StaticKeywordSample friend3 = new StaticKeywordSample("Squidward");
		StaticKeywordSample friend4 = new StaticKeywordSample("Sandy");
		
		StaticKeywordSample.displayFriends();
		
//		System.out.println(StaticKeywordSample.numberofFriends);
	}

}
