package lab3.prob4;

public class Condo extends Property {

	private int numberOfFloors;
	
	public Condo(int numberOfFloors, String address) {
		super.setAddress(address);
		this.numberOfFloors = numberOfFloors;
	}

	public Double computeRent(){
		return 500D * numberOfFloors;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
}
