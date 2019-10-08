package week2;

public class Yaris extends Car implements GasVehicle {

	private double gasInTank;
	
	public Yaris(String transmissionType) {
		super(transmissionType);
		gasInTank = 10.0;
	}

	public double getGasInTank() {
		return gasInTank;
	}
	
	@Override
	public void fillTank(double gallons) {
		if (gallons < 0) {
			// can't fill tank with negative gallons, do nothing.  
		} else if (gallons + gasInTank >= 10.0) {
			gasInTank = 10.0;
		} else {
			gasInTank += gallons;
		}
	}

	@Override
	public void depleteGas(double gallons) {
		if (gallons < 0) {
			System.out.println("Enter a positive number");
		} else if (gasInTank - gallons < 0) {
			gasInTank = 0;
		} else {
			gasInTank -= gallons;
		}
	}
	
	
}
