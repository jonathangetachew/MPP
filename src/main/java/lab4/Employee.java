package lab4;

import java.time.Month;
import java.time.Year;
import java.util.UUID;

/**
 * Created by Jonathan on 9/6/2019.
 */

public abstract class Employee {

	private String empId;

	public Employee() {
		this.empId = UUID.randomUUID().toString();
	}

	public void print() {

	}

	public Paycheck calcCompensation(Month month, Year year) {
		double grossPay = calcGrossPay(month, year);

		double ficaTax = grossPay * 0.23;
		double stateTax = grossPay * 0.05;
		double localTax = grossPay * 0.01;
		double medicare = grossPay * 0.03;
		double socialSecurity = grossPay * 0.075;

		return new Paycheck(grossPay, ficaTax, stateTax, localTax, medicare, socialSecurity);
	}

	public abstract double calcGrossPay(Month month, Year year);

	///> Setters and Getters
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
}
