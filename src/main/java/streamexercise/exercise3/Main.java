package streamexercise.exercise3;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jonathan on 9/20/2019.
 */

public class Main {
	public static void main(String[] args) {

		// Get Patient Record
		BiFunction<Patient, List<? extends PatientRecord<?>>, List<? extends PatientRecord<?>>> findPatientRecord =
				(p, recs) -> recs.stream()
					.filter(patientRecord -> patientRecord.getPatient().equals(p))
					.collect(Collectors.toList());

		// Get Patient Records
		QuadFunction<Patient, List<PatientRecord<Medication>>, List<PatientRecord<Lab>>,
				List<PatientRecord<Diagnosis>>, List<PatientRecord<?>>> findPatientRecords =
				(p, medRecs, labRecs, diaRecs) ->
						Stream.concat(
								Stream.concat(
									findPatientRecord.apply(p, medRecs).stream(),
									findPatientRecord.apply(p, labRecs).stream()
								),
								findPatientRecord.apply(p, diaRecs).stream()
						).collect(Collectors.toList());

		// Find List Intersection
		BiFunction<List<? extends PatientRecord<?>>, List<? extends PatientRecord<?>>, Long>
				findCommonRecords = (firstRecs, secondRecs) ->
					firstRecs.stream()
						.distinct()
						.filter(secondRecs::contains)
						.count();

		// Calculate Jaccard Index
		BiFunction<List<? extends PatientRecord<?>>, List<? extends PatientRecord<?>>, Optional<Double>> jaccardIndex =
				(p1, p2) ->
						Optional.of(findCommonRecords.apply(p1, p2).doubleValue() / (double) (p1.size() + p2.size()
								- findCommonRecords.apply(p1, p2)));

		// Find top K patients that are similar to given patient
		HexFunction<List<Patient>, List<PatientRecord<Medication>>, List<PatientRecord<Lab>>,
				List<PatientRecord<Diagnosis>>, Integer, Patient, List<Patient>> findTopKSimilarPatients =
					(patients, medicationRecords, labRecords, diagnosisRecords, k, p) ->
						patients.stream()
							.filter(patient -> !patient.equals(p))
							.sorted((o1, o2) -> (int) (
									jaccardIndex
									.apply(findPatientRecords.apply(o2, medicationRecords, labRecords, diagnosisRecords),
										findPatientRecords.apply(p, medicationRecords, labRecords, diagnosisRecords))
										.orElse(0D)

											- // Subtract for descending filter

									jaccardIndex
											.apply(findPatientRecords.apply(o1, medicationRecords, labRecords, diagnosisRecords),
												findPatientRecords.apply(p, medicationRecords, labRecords, diagnosisRecords))
												.orElse(0D)))
							.limit(k)
							.collect(Collectors.toList());



	}
}
