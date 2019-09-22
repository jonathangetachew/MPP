package lesson10.labs.prob5.soln2;

import lesson10.labs.prob5.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class RefactoredMain {
	public static String asString(List<Employee> emps) {
		return lastNameAfterM.apply(
					salaryGreaterThan100000.apply(emps)
			).stream()
				.map(employee -> fullName(employee))
				.sorted()
				.collect(Collectors.joining(", "));
	}

	public static Function<List<Employee>, List<Employee>> salaryGreaterThan100000 = employees ->
			employees.stream()
				.filter(employee -> employee.getSalary() > 100000)
				.collect(Collectors.toList());

	public static Function<List<Employee>, List<Employee>> lastNameAfterM = employees ->
			employees.stream()
				.filter(employee -> employee.getLastName().charAt(0) > 'M')
				.collect(Collectors.toList());

	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}
}
