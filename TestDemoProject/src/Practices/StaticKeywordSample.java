package Practices;

public class StaticKeywordSample {
	
	String name;
	static int numberofFriends;
	
	StaticKeywordSample(String name) {
		this.name = name;
		numberofFriends++;
	}
	
	static void displayFriends() {
		System.out.println("You have " +numberofFriends+ " friends.");
	}

}
