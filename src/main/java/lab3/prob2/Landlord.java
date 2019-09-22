package lab3.prob2;

import java.util.List;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Landlord {
	private List<Building> buildings;

	public Landlord(List<Building> buildings) {
		this.buildings = buildings;
	}

	public Double calculateProfits() {
		if (buildings == null) return 0D;
		return buildings.stream()
				.mapToDouble(Building::monthlyTotalProfit)
				.sum();
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
}
