package lab4;

import java.time.Month;
import java.time.Year;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Hourly extends Employee {

	private double hourlyWage;
	private double hoursPerWeek;

	public Hourly(double hourlyWage, double hoursPerWeek) {
		super();
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double calcGrossPay(Month month, Year year) {
		return hourlyWage * hoursPerWeek;
	}

	///> Setters and Getters
	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(double hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
}
