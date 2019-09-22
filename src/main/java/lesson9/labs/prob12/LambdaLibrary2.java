package lesson9.labs.prob12;

import lesson9.labs.prob11b.TriFunction;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class LambdaLibrary2 {
	public static final TriFunction<List<Employee>, Float, Character, List<String>>
			EMPLOYEE_NAMES_MIN_SALARY_LAST_NAME_START_WITH_AFTER =	(employees, minSalary, nameStartChar) ->
			employees.stream()
					.filter(employee -> employee.getSalary() > minSalary && employee.getLastName()
							.matches("(" +
									Stream.iterate(nameStartChar, i -> (char) (i + 1))
											.limit(getRemainingCharCount(nameStartChar)).collect(Collectors.toList()) +
									").*"))
					.map(employee -> employee.getFirstName() + " " + employee.getLastName())
					.sorted()
					.collect(Collectors.toList());

	public static final TriFunction<List<Employee>, Float, Character, List<String>>
			EMPLOYEE_NAMES_MIN_SALARY_FIRST_NAME_START_WITH_BEFORE = (employees, minSalary, nameEndChar) ->
			employees.stream()
					.filter(employee -> employee.getSalary() > minSalary && employee.getFirstName()
							.matches("(" +
									Stream.iterate('A', i -> (char) (i + 1))
											.limit(getRemainingCharCount(nameEndChar)).collect(Collectors.toList()) +
									").*"))
					.map(employee -> employee.getFirstName().toUpperCase() + " " + employee.getLastName().toUpperCase())
					.sorted()
					.collect(Collectors.toList());

	private static int getRemainingCharCount(Character c) {
		// 90 - Z
		return 90 - (int) c;
	}

	private static int getCharCountUntil(Character c) {
		// 65 - A
		return (int) c - 65;
	}
}
