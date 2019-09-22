package streamexercise.exercise3;

import java.util.Objects;

/**
 * Created by Jonathan on 9/20/2019.
 */

public class Diagnosis {
	private String icd9Code;
	private String name;

	public String getIcd9Code() {
		return icd9Code;
	}

	public void setIcd9Code(String icd9Code) {
		this.icd9Code = icd9Code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Diagnosis diagnosis = (Diagnosis) o;
		return icd9Code.equals(diagnosis.icd9Code) &&
				name.equals(diagnosis.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(icd9Code, name);
	}
}
