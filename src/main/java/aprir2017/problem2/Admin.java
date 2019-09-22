package aprir2017.problem2;

import java.util.Arrays;

public class Admin {

	private Department[] departments;

	public Admin(Department[] departments) {
		this.departments = departments;
	}

	public String hourlyCompanyMessage() {
		StringBuilder stringBuilder = new StringBuilder();

		for(Department department : departments) {
			stringBuilder.append(format(department.getName(), department.nextMessage()) + "\n");
		}

		return stringBuilder.toString();
	}

	public String format(String name, String message) {
		return name + ": " + message;
	}
}
