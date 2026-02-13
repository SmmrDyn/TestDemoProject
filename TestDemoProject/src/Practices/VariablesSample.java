package Practices;

import java.util.Random;

public class VariablesSample {
	
	Random random;
	int number = 0;
	
	VariablesSample() {
//		Random random = new Random();
//		int number = 0;
//		roll(random, number);
		
		random = new Random();
		roll();
	}
	
	//void roll(Random random, int number)
	void roll() {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}

}
