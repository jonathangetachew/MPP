package streamexercise.exercise2;

import java.util.List;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class School {
	private List<Teacher> teachers;

	public School(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
}
