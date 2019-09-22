package exercise.intern;

import java.util.List;

/**
 * Created by Jonathan on 9/6/2019.
 */

public class Department {
	List<Employee> employees;

	public Department(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
