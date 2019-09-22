package lab3.prob4;

public class House extends Property {

	private double lotSize;

	public House(double lotSize, String address) {
		super.setAddress(address);
		this.lotSize = lotSize;
	}

	public Double computeRent(){
		return 0.1 * lotSize;
	}

	public double getLotSize() {
		return lotSize;
	}

	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}
}
