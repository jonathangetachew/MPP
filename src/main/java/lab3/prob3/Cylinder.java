package lab3.prob3;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Cylinder {
	private Double height;
	private Circle circle;

	public Cylinder(Double height, Circle circle) {
		this.height = height;
		this.circle = circle;
	}

	public Double computeVolume() {
		if(circle == null) return 0D;
		return this.circle.computeArea() * this.height;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
