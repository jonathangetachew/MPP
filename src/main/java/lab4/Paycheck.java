package lab4;

/**
 * Created by Jonathan on 9/6/2019.
 */

public final class Paycheck {

	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;

	public Paycheck(double grossPay, double fica, double state,
	                double local, double medicare, double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}

	public void print() {
	}

	///> Setters and Getters
	public double getNetPay() {
		return grossPay - (fica + state + local + medicare + socialSecurity);
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}
}
