package lab3.prob3;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Circle {

	private final Double PI = 3.14D;
	private Double radius;

	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double computeArea() {
		return PI * radius * radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
}
