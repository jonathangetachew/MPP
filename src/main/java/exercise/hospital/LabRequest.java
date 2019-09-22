package exercise.hospital;

/**
 * Created by Jonathan on 9/7/2019.
 */

public class LabRequest {

	private LabId Id;
	private String name;
	private String description;

	public LabRequest(LabId id, String name, String description) {
		Id = id;
		this.name = name;
		this.description = description;
	}

	///> Setters and Getters
	public LabId getId() {
		return Id;
	}

	public void setId(LabId id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
