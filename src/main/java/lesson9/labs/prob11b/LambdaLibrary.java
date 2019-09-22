package lesson9.labs.prob11b;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jonathan on 9/22/2019.
 */

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Float, Character, List<String>>
			EMPLOYEE_NAMES_MIN_SALARY_LAST_NAME_START_WITH =	(employees, minSalary, nameStartChar) ->
				employees.stream()
					.filter(employee -> employee.getSalary() > minSalary && employee.getLastName()
							.matches("(" +
								Stream.iterate(nameStartChar, i -> (char) (i + 1))
										.limit(getRemainingCharCount(nameStartChar)).collect(Collectors.toList()) +
									").*"))
					.map(employee -> employee.getFirstName() + " " + employee.getLastName())
					.sorted()
					.collect(Collectors.toList());

	private static int getRemainingCharCount(Character c) {
		// 90 - Z
		return 90 - (int) c;
	}
}
