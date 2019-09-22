package exercise.hospital;

import java.time.LocalDate;

/**
 * Created by Jonathan on 9/7/2019.
 */

public class Visit {
	private Patient patient;
	private LocalDate date;
	private int feedback;
	private Note note;

	public Visit(Patient patient, LocalDate date, int feedback, Note note) {
		this.patient = patient;
		this.date = date;
		this.feedback = feedback;
		this.note = note;
	}

	///> Setters and Getters
	public int getFeedback() {
		return feedback;
	}

	public void setFeedback(int feedback) {
		this.feedback = feedback;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
