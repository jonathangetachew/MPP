package streamexercise.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Hospital {

	private List<Department> departments;

	public Hospital(List<Department> departments) {
		this.departments = departments;
	}

	public Map<Optional<Doctor>, Integer> topDoctor() {
		Optional<Doctor> doctor = departments.stream()
				.flatMap(department -> department.getDoctorList().stream())
				.sorted((doc1, doc2) -> doc2.getVisits().size() - doc1.getVisits().size())
				.findFirst();

		Map<Optional<Doctor>, Integer> rv = new HashMap<>();
		rv.put(doctor, doctor.get().getVisits().size());

		return rv;
	}

	public long doctorCountWithNameStartWithLetter(String character) {
		return departments.stream()
				.flatMap(department -> department.getDoctorList().stream())
				.filter(doctor -> doctor.getName().startsWith(character))
				.count();
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
}
