package lab3.prob2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jonathan on 9/6/2019.
 */


/*

 Instead of inheritance I used composition to put properties of classes in the higher one

 */
public class Main {
	public static void main(String[] args) {

		Apartment apartment1 = new Apartment(150D);
		Apartment apartment2 = new Apartment(200D);
		Apartment apartment3 = new Apartment(300D);
		Apartment apartment4 = new Apartment(400D);
		Apartment apartment5 = new Apartment(500D);
		Apartment apartment6 = new Apartment(600D);

		List<Apartment> b1Apartments = new ArrayList<Apartment>();
		b1Apartments.add(apartment1);
		b1Apartments.add(apartment2);

		List<Apartment> b2Apartments = new ArrayList<Apartment>();
		b1Apartments.add(apartment3);
		b1Apartments.add(apartment4);
		b1Apartments.add(apartment5);
		b1Apartments.add(apartment6);

		Building building1 = new Building(100D, b1Apartments);
		Building building2 = new Building(200D, b2Apartments);

		List<Building> buildings = new ArrayList<Building>();
		buildings.add(building1);
		buildings.add(building2);

		Landlord landlord = new Landlord(buildings);

		System.out.println("Total Profits = " + landlord.calculateProfits());
	}
}
