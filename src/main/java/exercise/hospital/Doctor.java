package exercise.hospital;

import java.util.List;

/**
 * Created by Jonathan on 9/7/2019.
 */

public class Doctor {
	private String name;
	private List<Visit> visits;

	public Doctor(String name, List<Visit> visits) {
		this.name = name;
		this.visits = visits;
	}

	///> Setters and Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}
}
