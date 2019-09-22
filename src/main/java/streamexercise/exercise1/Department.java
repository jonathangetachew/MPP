package streamexercise.exercise1;

import java.util.List;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Department {
	private List<Doctor> doctorList;

	public Department(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}

	public List<Doctor> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctor> doctorList) {
		this.doctorList = doctorList;
	}
}
