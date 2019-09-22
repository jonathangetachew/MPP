package lab4;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Order {

	private long orderNo;
	private LocalDate orderDate;
	private double orderAmount;
	private Commissioned commissioned;

	public Order(long orderNo, LocalDate orderDate, double orderAmount, Commissioned commissioned) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
		this.commissioned = commissioned;
	}

	///> Setters and Getters
	public long getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public Commissioned getCommissioned() {
		return commissioned;
	}

	public void setCommissioned(Commissioned commissioned) {
		this.commissioned = commissioned;
	}
}
