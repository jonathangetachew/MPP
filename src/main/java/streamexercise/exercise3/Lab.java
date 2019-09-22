package streamexercise.exercise3;

import java.util.Objects;

/**
 * Created by Jonathan on 9/20/2019.
 */

public class Lab {
	private String labId;
	private String labName;

	public String getLabId() {
		return labId;
	}

	public void setLabId(String labId) {
		this.labId = labId;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Lab lab = (Lab) o;
		return labId.equals(lab.labId) &&
				labName.equals(lab.labName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(labId, labName);
	}
}
