package streamexercise.exercise2;

import java.util.List;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Student {
	private String name;
	private List<Grade> grades;

	public Student(String name, List<Grade> grades) {
		this.name = name;
		this.grades = grades;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
}
