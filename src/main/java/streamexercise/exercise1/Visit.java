package streamexercise.exercise1;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Visit {
	private Doctor doctor;
	private Patient patient;
	private Integer rating;
	private LocalDateTime date;
	private List<VisitResult> visitResults;

	public Visit(Doctor doctor, Patient patient, Integer rating, LocalDateTime date, List<VisitResult> visitResults) {
		this.doctor = doctor;
		this.patient = patient;
		this.rating = rating;
		this.date = date;
		this.visitResults = visitResults;
	}

	public List<VisitResult> getVisitResults() {
		return visitResults;
	}

	public void setVisitResults(List<VisitResult> visitResults) {
		this.visitResults = visitResults;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
