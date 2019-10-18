package Week4;

public class Volt extends Car implements ElectricVehicle{

	private Double vehicleCharge;
	
	public Volt(String transmissionType) {
		super(transmissionType);
		vehicleCharge = 100.00;
	}

	@Override
	public void recharge(int minutes) {
		
		// check for negative minutes
		if (minutes < 0) {
			// do nothing because you can't have a negative charge.
		}
		
		// if vehicleCharge + minute >= 100, fully charged
		else if (vehicleCharge + minutes >= 100) {
			vehicleCharge = 100.00;
		}
		
		// if minutes + vehicleCharge < 100, vehicle charge = minutes + vehicleCharge
		else {
			vehicleCharge += minutes;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Volt) {
			super.equals(obj);
		}
		return false;
	}

	@Override
	public void depleteCharge(double depleteAmount) {
		vehicleCharge -= depleteAmount;
		if (vehicleCharge < 0) {
			vehicleCharge = 0.0;
		}
	}
	
	private void alertBatteryDepleted() {
		System.out.println("Battery depleted, recharge your car!");
	}
	
	public double getVehicleCharge() {
		return vehicleCharge;
	}

}
