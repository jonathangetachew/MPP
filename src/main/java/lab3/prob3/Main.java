package lab3.prob3;

/**
 * Created by Jonathan on 9/6/2019.
 */

/*


 In the previous code Circle was inheriting properties it didn't need, now the inheritance is happening the other way
 because a cylinder has a circle as its base


 */
public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(10D);
		Cylinder cylinder = new Cylinder(20D, circle);

		System.out.println("Volume = " + cylinder.computeVolume());
	}
}
