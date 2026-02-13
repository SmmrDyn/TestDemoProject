package ObjectPassing;

public class Main {

	public static void main(String[] args) {
		Garage garage = new Garage();
		Cars car1 = new Cars("BMW");
		Cars car2 = new Cars("Tesla");
		
		garage.park(car2);

	}

}
