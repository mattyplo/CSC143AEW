package Week4;

public class client {

	public static void main(String[] args) {
		Car car1 = new Car("Automatic");
		Car car2 = new Car("Manual");
		Car car3 = new Car("Automatic");
		
		//
		System.out.println("First round of equals checking:" );
		// check if same type in equals
		System.out.println(car1.equalsInstanceOf(car2));
		
		// check if same type via transmission type and instanceof
		System.out.println(car1.equalsTransmissionType(car2));
		System.out.println(car1.equalsTransmissionType(car3));
		
		System.out.println("\nSecond round of equals checking:");
		
		car1.setColor("Red");
		car2.setColor("Red");
		car3.setColor("Red");
		Car car4 = new Car("Manual");
		car4.setColor("Red");
		System.out.println("Car1 is equal to Car2: " + car1.equals(car2));
		System.out.println("Car1 is equal to Car3: " + car1.equals(car3));
		System.out.println("Car2 is equal to Car4: " + car2.equals(car4));
		
		
		System.out.println("\nThird round of equals checking");
		Yaris yar1 = new Yaris("Automatic");
		Tesla tes1 = new Tesla("Automatic");
		yar1.setColor("Red");
		tes1.setColor("Red");
		System.out.println("yar1 is equal to tes1: " + yar1.equals(tes1));
		System.out.println("yar1 is equal to car1: " + yar1.equals(car1));
		Volt volt1 = new Volt("Automatic");
		volt1.setColor("Red");
		System.out.println("volt1 is equal to tes1: " + volt1.equals(tes1));
		System.out.println("tes1 is equal to volt1: " + tes1.equals(volt1));
		
		
		
	}
}
