//package exercise.hospital;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by Jonathan on 9/7/2019.
// */
//
//public class Hospital {
//
//	private List<Department> departments;
//
//	public Hospital(List<Department> departments) {
//		this.departments = departments;
//	}
//
//	public void displayAwardReceiver(Department department) {
//		List<Map<Doctor, Double>> highestRatedDoctors = new ArrayList<>();
//
//		for (Department department1 : departments) {
//			if (department1.getHighestRatedDoctor() != null) {
//				highestRatedDoctors.add(department1.getHighestRatedDoctor());
//			}
//		}
//
////		Map<Doctor, Double> highestRatedDoctor = new HashMap<>();
////		highestRatedDoctor = highestRatedDoctors.stream()
////				.map(hd -> hd.get())
//	}
//
//	public static void main(String[] args) {
////		Hospital hospital = new Hospital();
//
////		hospital.displayAwardReceiver();
//	}
//}
