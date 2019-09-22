package lesson10.labs.prob5.soln2;

import lesson10.labs.prob5.Employee;
import lesson10.labs.prob5.Main;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class EmployeeTest2 {

	@Test
	public void salaryGreaterThan100000Test() {
		//given
		Employee emp1 = new Employee("John", "Sims", 110000);
		Employee emp2 = new Employee("Thomas", "Blake", 111000);

		List<Employee> employees = new ArrayList<>(Arrays.asList(emp1, emp2));

		//when
		List<Employee> actualValue = RefactoredMain.salaryGreaterThan100000.apply(employees);

		//then
		assertEquals(2, actualValue.size());

	}

	@Test
	public void lastNameAfterM() {
		//given
		Employee emp1 = new Employee("John", "Sims", 110000);
		Employee emp2 = new Employee("Thomas", "Blake", 111000);

		List<Employee> employees = new ArrayList<>(Arrays.asList(emp1, emp2));

		//when
		List<Employee> actualValue = RefactoredMain.lastNameAfterM.apply(employees);

		//then
		assertEquals(1, actualValue.size());

	}

	@Test
	public void fullNameTest() {
		//given
		Employee employee = new Employee("John", "Thomson", 1000000);

		//when
		String actualValue = RefactoredMain.fullName(employee);

		//then
		assertEquals(employee.getFirstName() + " " + employee.getLastName(), actualValue);
	}

}
