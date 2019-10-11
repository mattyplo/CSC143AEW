package week3;

public class client {

	public static void main(String[] args) {
		// shallow copy erases array in car1 when you reset passengers in car2!
		Car car1 = new Car("Automatic");
		
		String[] names = {"Fred", "Sue", "David", "Alicia"};
		String[] names2 = {"Ron", "Patricia", "Sue"};
		
		car1.setPassengerNames(names);
		car1.printPassengerNames();
		
		Car car2 = car1;
		car2.setPassengerNames(names2);
		car1.printPassengerNames();
		
		
		// deep copy creates a new identical array, and a change to the deep copy doesn't affect original copy
		Car car3 = new Car("Automatic");
		car3.setPassengerNames(names);
		System.out.println("car3 original passengers: ");
		car3.printPassengerNames();
		
		Car car4 = car3.deepCopy();
		car4.setPassengerNames(names2);
		
		System.out.println("car3 still has original passengers: ");
		car3.printPassengerNames();
		
		System.out.println("car4 has new passengers: ");
		car4.printPassengerNames();
		
	}

}
