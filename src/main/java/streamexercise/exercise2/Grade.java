package streamexercise.exercise2;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Grade {

	private GradeLetter gradeLetter;

	private Student student;

	private Course course;

	public Grade(GradeLetter gradeLetter, Student student, Course course) {
		this.gradeLetter = gradeLetter;
		this.student = student;
		this.course = course;
	}

	public GradeLetter getGradeLetter() {
		return gradeLetter;
	}

	public void setGradeLetter(GradeLetter gradeLetter) {
		this.gradeLetter = gradeLetter;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
}
