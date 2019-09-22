package lab3.prob4;

public class Trailer extends Property {

	public Trailer(String address) {
		super.setAddress(address);
	}

	public Double computeRent(){
		return 500D;
	}
}
