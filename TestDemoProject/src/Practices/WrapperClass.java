package Practices;

public class WrapperClass {

	public static void main(String[] args) {
		//wrapper class - way to use primitive data 		types as reference data types
		//can be used with collections ex.ArrayList
		
		//primitive      //wrapper
		//boolean		//Boolean
		//char			//Character
		//int			//Integer
		//double		//Double
		
		//autoboxing - automatic conversion between 		primitive and their corresponding object 		wrapper class
		//unboxing - the reverse of autoboxing. 		automatic conversion of wrapper class to 		primitive
		
		Boolean a = true;
		Character b = '@';
		Integer c = 123;
		Double d = 3.14;
		String e = "Okay";
		
		if(a==true) {
			System.out.println("This is true");
		}

	}

}
