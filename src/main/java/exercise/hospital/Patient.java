package exercise.hospital;

/**
 * Created by Jonathan on 9/7/2019.
 */

public class Patient {
	private String id;
	private String name;

	public Patient(String id, String name) {
		this.id = id;
		this.name = name;
	}

	///> Setters and Getters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
