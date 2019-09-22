package streamexercise.exercise2;

import java.util.List;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Teacher {
	private List<Grade> grades;

	public Teacher(List<Grade> grades) {
		this.grades = grades;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
}
