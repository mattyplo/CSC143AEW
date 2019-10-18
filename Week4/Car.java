package Week4;

public class Car extends Automobile {
	
	private String color;
	
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
	
	public void setColor(String c) {
		color = c;
	}
	
	public String getColor() {
		return color;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Car) {
			Car otherCar = (Car)obj;
			if (otherCar.getTransmissionType() == this.getTransmissionType()) {
				if (otherCar.color == color) {
					return true;
				} 
			}
		}
		// at least one of the tests failed, and thus the cars are not equal.
		return false;
	}
	
	public boolean equalsTransmissionType(Object obj) {
		if (obj instanceof Car) {
			Car otherCar = (Car)obj;
			if(otherCar.getTransmissionType() == this.getTransmissionType()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public boolean equalsInstanceOf(Object obj) {
		if (obj instanceof Car) {
			return true;
		} else {
			return false;
		}
	}

}

