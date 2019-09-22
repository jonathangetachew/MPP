//package exercise.hospital;
//
//import exercise.intern.Manager;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by Jonathan on 9/7/2019.
// */
//
//public class Department {
//	private Manager manager;
//	private List<Doctor> doctors;
//
//	public Department(Manager manager, List<Doctor> doctors) {
//		this.manager = manager;
//		this.doctors = doctors;
//	}
//
//	public Map<Doctor, Double> getHighestRatedDoctor() {
//
//		Map<Doctor, Double> doctorFeedback = new HashMap<>();
//
//		for (Doctor doctor : doctors) {
//			int numberOfFeedback = 0;
//			int totalFeedbackScore = 0;
//			if (doctor.getVisits() != null) {
//				for (Visit visit : doctor.getVisits()) {
//					totalFeedbackScore += visit.getFeedback();
//					numberOfFeedback++;
//				}
//				doctorFeedback.put(doctor, Double.valueOf(totalFeedbackScore / numberOfFeedback));
//			}
//		}
//
//		return doctorFeedback;
//	}
//
//	///> Setters and Getters
//	public Manager getManager() {
//		return manager;
//	}
//
//	public void setManager(Manager manager) {
//		this.manager = manager;
//	}
//
//	public List<Doctor> getVisits() {
//		return doctors;
//	}
//
//	public void setVisits(List<Doctor> visits) {
//		this.doctors = visits;
//	}
//}
