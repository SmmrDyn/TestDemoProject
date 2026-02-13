package Practices;

public class ArrayObjects {

	public static void main(String[] args) {
		
//		ArrayObjectsSample[] refrigerator = new ArrayObjectsSample[3];
		
		ArrayObjectsSample food1 = new ArrayObjectsSample("pizza");
		ArrayObjectsSample food2 = new ArrayObjectsSample("banana");
		ArrayObjectsSample food3 = new ArrayObjectsSample("chuckie");
		
		ArrayObjectsSample[] refrigerator = {food1, food2, food3};
		
//		refrigerator[0] = food1;
//		refrigerator[1] = food2;
//		refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);

	}

}
