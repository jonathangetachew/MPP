package exercise.march2017prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
	private String name;
	private List<Account> accounts;

	public Employee(String name) {
		this.name = name;
		this.accounts = new ArrayList<>();
	}

	public double computeUpdatedBalanceSumEmployee() {
		//implement
		return accounts.stream()
				.filter(Objects::nonNull)
				.mapToDouble(Account::computeUpdatedBalance)
				.sum();
	}

	public String getName() {
		return name;
	}

	public void addAccount(Account account) {
		if (account != null)
			accounts.add(account);
	}
}
