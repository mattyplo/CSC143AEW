package week3;

public class Car extends Automobile {
	
	public Car(String transmissionType) {
		super(4, transmissionType);
	}
	
	public Car deepCopy() {
		Car deepCopy = new Car(this.getTransmissionType());
		String[] currentPassengers = this.getPassengers();
		String[] newPassengers = new String[currentPassengers.length];
		for (int i = 0; i < currentPassengers.length; i++) {
			newPassengers[i] = currentPassengers[i];
		}
		deepCopy.setPassengerNames(newPassengers);
		return deepCopy;
	}

}

