package exercise.hospital;

import java.util.List;

/**
 * Created by Jonathan on 9/7/2019.
 */

public class Note {
	private List<LabRequest> labRequests;
	private List<Drug> drugs;
	private List<String> diagnosis;

	public Note(List<LabRequest> labRequests, List<Drug> drugs, List<String> diagnosis) {
		this.labRequests = labRequests;
		this.drugs = drugs;
		this.diagnosis = diagnosis;
	}

	///> Setters and Getters
	public List<LabRequest> getLabRequests() {
		return labRequests;
	}

	public void setLabRequests(List<LabRequest> labRequests) {
		this.labRequests = labRequests;
	}

	public List<Drug> getDrugs() {
		return drugs;
	}

	public void setDrugs(List<Drug> drugs) {
		this.drugs = drugs;
	}

	public List<String> getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(List<String> diagnosis) {
		this.diagnosis = diagnosis;
	}
}
