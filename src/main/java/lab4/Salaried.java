package lab4;

import java.time.Month;
import java.time.Year;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Salaried extends Employee {
	private double salary;

	public Salaried(double salary) {
		super();
		this.salary = salary;
	}

	@Override
	public double calcGrossPay(Month month, Year year) {
		return salary;
	}

	///> Setters and Getters
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
