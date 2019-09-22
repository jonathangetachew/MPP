package lab3.prob4;

/**
 * Created by Jonathan on 9/6/2019.
 */

public abstract class Property {
	private String address;
	public abstract Double computeRent();

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
