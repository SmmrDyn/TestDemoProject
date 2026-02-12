package Practices;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//array list - a resizable array
		//				elements can be added and removed after compilation phase
		//				store reference data types

		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi"); //replace the pizza
		food.remove(2);
		food.clear(); //remove all food
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
