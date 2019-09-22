package streamexercise.exercise3;

import java.util.Objects;

/**
 * Created by Jonathan on 9/20/2019.
 */

public class PatientRecord<T> {
	private T record;
	private Patient patient;

	public T getRecord() {
		return record;
	}

	public void setRecord(T record) {
		this.record = record;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PatientRecord<?> that = (PatientRecord<?>) o;
		return record.equals(that.record) &&
				patient.equals(that.patient);
	}

	@Override
	public int hashCode() {
		return Objects.hash(record, patient);
	}
}
