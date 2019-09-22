package streamexercise.exercise3;

import java.util.Objects;

/**
 * Created by Jonathan on 9/20/2019.
 */

public class Medication {
	private String id;
	private String drugName;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Medication that = (Medication) o;
		return id.equals(that.id) &&
				drugName.equals(that.drugName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, drugName);
	}
}
