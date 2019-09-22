package exercise.hospital;

import java.util.List;

/**
 * Created by Jonathan on 9/7/2019.
 */

public class Manager extends Doctor {

	private List<Doctor> doctors;

	public Manager(String name) {
		super(name, null);
	}

	///> Setters and Getters
	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
}
