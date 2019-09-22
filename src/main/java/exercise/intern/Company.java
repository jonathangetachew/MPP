package exercise.intern;

import java.util.List;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Company {
	List<Department> departments;

	public Company(List<Department> departments) {
		this.departments = departments;
	}

	public String getHighestExpenseCategory() {
		return null;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
}
