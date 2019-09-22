package lab4;

import java.time.Month;
import java.time.Year;
import java.util.List;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Commissioned extends Employee {
	private double commission;
	private double baseSalary;
	private List<Order> orders;

	public Commissioned(double commission, double baseSalary, List<Order> orders) {
		super();
		this.commission = commission;
		this.baseSalary = baseSalary;
		this.orders = orders;
	}

	@Override
	public double calcGrossPay(Month month, Year year) {
		double gross = baseSalary;

		/*
			YearMonth currentMonthYear = YearMonth.of(year, month);
			YearMonth lastMonthYear = currentMonthYear.minusMonth(1);

		 */

		double totalOrderAmount = orders.stream()
				.filter(order -> order.getOrderDate().getMonth().equals(month))
				.mapToDouble(Order::getOrderAmount)
				.sum();

		return gross + (totalOrderAmount * commission);
	}

	///> Setter and Getters
	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
