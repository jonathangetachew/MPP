package lab3.prob4;

import java.util.Arrays;

public class Admin {
	public static double computeTotalRent(Object[] properties) {
		return Arrays.asList(properties)
				.stream()
				.filter(p -> p instanceof Property)
				.mapToDouble(p -> ((Property) p).computeRent())
				.sum();
	}

	public static void listProperties(Object[] properties, String address) {
		Arrays.asList(properties)
				.stream()
				.filter(p -> (p instanceof Property && ((Property) p).getAddress().equals(address)))
				.forEach(p -> {
					if ( p instanceof House ) System.out.println("House in " + ((House) p).getAddress() + " with " +
							((House) p).getLotSize() + " costs " + ((House) p).computeRent());
					else if ( p instanceof Trailer ) System.out.println("Trailer in " + ((Trailer) p).getAddress() +
							" costs " + ((Trailer) p).computeRent());
					else if ( p instanceof Condo ) System.out.println("Condo in " + ((Condo) p).getAddress() + " with " +
							((Condo) p).getNumberOfFloors() + " costs " + ((Condo) p).computeRent());
				});
	}
}
