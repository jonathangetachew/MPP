package streamexercise.exercise1;

import java.util.List;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Doctor {
	private String name;
	private List<Visit> visits;
	private Integer age;

	public Doctor(String name, List<Visit> visits) {
		this.name = name;
		this.visits = visits;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
