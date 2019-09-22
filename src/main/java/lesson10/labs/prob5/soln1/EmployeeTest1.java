package lesson10.labs.prob5.soln1;

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

public class EmployeeTest1 {

	@Test
	public void asStringTest() {
		//given
		Employee emp1 = new Employee("John", "Sims", 110000);
		Employee emp2 = new Employee("Thomas", "Blake", 111000);

		List<Employee> employees = new ArrayList<>(Arrays.asList(emp1, emp2));

		//when
		String actualValue = Main.asString(employees);

		//then
		assertEquals(emp1.getFirstName() + " " + emp1.getLastName(), actualValue);

	}


}
