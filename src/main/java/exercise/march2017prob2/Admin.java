package exercise.march2017prob2;

import java.util.List;
import java.util.Objects;

public class Admin {
	public double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		return list.stream()
				.filter(Objects::nonNull)
				.mapToDouble(Employee::computeUpdatedBalanceSumEmployee)
				.sum();
	}
}
