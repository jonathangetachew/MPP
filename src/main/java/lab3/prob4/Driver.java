package lab3.prob4;

public class Driver {

	public static void main(String[] args) {

		Object[] objects = { new House(9000, "Iowa"), new Condo(2, "Iowa"), new Trailer("Orlando") };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);

		System.out.println("Properties in Iowa");
		Admin.listProperties(objects, "Iowa");
	}
}
