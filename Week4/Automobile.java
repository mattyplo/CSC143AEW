package Week4;

public abstract class Automobile {
	private int numWheels;
	private String transmissionType;
	private String[] passengerNames;
	
	// Here we can showcase this.numwheels = numWheels, and change the argument.  
	// Point being to highlight how the keyword this works.  
	public Automobile(int numWheels, String transmissionType) {
		this.numWheels = numWheels;
		this.transmissionType = transmissionType;
	}
	
	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
	public int getNumWheels() {
		return numWheels;
	}
	
	public String getTransmissionType() {
		return transmissionType;
	}
	
	public void honk() {
		System.out.println("Honk!");
	}
	
	public void setPassengerNames(String[] names) {
		this.passengerNames = names;
	}
	
	public String[] getPassengers() {
		return this.passengerNames;
	}
	
	public void printPassengerNames() {
		for (int i = 0; i < passengerNames.length; i ++) {
			System.out.println(passengerNames[i]);
		}
	}
}
