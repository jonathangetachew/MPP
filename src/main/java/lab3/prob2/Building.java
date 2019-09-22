package lab3.prob2;

import java.util.List;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Building {
	private Double maintenanceCost;
	private List<Apartment> apartments;

	public Building(Double maintenanceCost, List<Apartment> apartments) {
		this.maintenanceCost = maintenanceCost;
		this.apartments = apartments;
	}

	public Double monthlyTotalProfit() {
		if (apartments == null) return 0D;
		Double rent = apartments.stream()
				.mapToDouble(Apartment::getRent)
				.sum();

		return rent - maintenanceCost;
	}

	public Double getMaintenanceCost() {
		return maintenanceCost;
	}

	public void setMaintenanceCost(Double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(List<Apartment> apartments) {
		this.apartments = apartments;
	}
}
