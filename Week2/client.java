package week2;

public class client {

	public static void main(String[] args) {
		Car fastCar = new Car("Automatic");
		fastCar.honk();
		
		Tesla s3 = new Tesla("Automatic");
		System.out.println(s3.getVehicleCharge());
		
		// If you static type something, and use a child class as the dynamic type, you won't be able to use a method in the child class if it's static type doesn't have the method!
		Car s4 = new Tesla("Automatic");
		// System.out.println(s4.getVehicleCharge());
		
		Car normalCar = new Car("Manual");
		
		Yaris hatchback = new Yaris("Automatic");
		hatchback.depleteGas(5.0);
		System.out.println("This car has " + hatchback.getGasInTank() + " gallons in the tank.");
		
		// We can create an array of cars of different types and get them to do similar things.
		Car[] salesFloor = {s3, s4, normalCar, hatchback};
		for (int i = 0; i < salesFloor.length; i ++) {
			salesFloor[i].honk();
		}
		
		
	}

}
