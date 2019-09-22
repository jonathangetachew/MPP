package streamexercise;

import streamexercise.exercise1.*;
import streamexercise.exercise2.*;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Jonathan on 9/19/2019.
 */

public class Main {
	public static void main(String[] args) {
		TriFunction<Integer, Integer, Integer, Integer> ternaryFunction =
				(t, u, v) -> t * t + u * u + v * v;

		System.out.println(ternaryFunction.apply(2, 3, 4));

		// Get oldest doctors with name starting with character in upper case
		TriFunction<Hospital, Character, Integer, List<String>> oldDoctorsWithNameStartWithCharCCapitalized =
				(h, c, k) -> h.getDepartments().stream()
						.flatMap(department -> department.getDoctorList().stream())
						.filter(doctor -> doctor.getName().startsWith(c.toString()))
						.sorted((doc1, doc2) -> doc2.getAge() - doc1.getAge())
						.limit(k)
						.map(doctor -> doctor.getName().toUpperCase())
						.collect(Collectors.toList());

		// Partial Application
//		Function<Character, List<String>> top5Doctors =
//				c -> oldDoctorsWithNameStartWithCharCCapitalized.apply(new Hospital(), c, 5);

		// Find oldest doctor who have seen a given patient
		BiFunction<Hospital, Patient, Optional<Doctor>> oldestDoctorWhoSawThePatient =
				(h, p) -> h.getDepartments().stream()
				.flatMap(dep -> dep.getDoctorList().stream())
				.filter(doc -> doc.getVisits().stream()
						.filter(visit -> visit.getPatient().equals(p))
						.count() > 0) // We need a predicate that returns a boolean... That's why count() > 0
				.sorted((doc1, doc2) -> doc2.getAge() - doc1.getAge())
				.findFirst();

		// Lab with most request
		Function<Hospital, Optional<Long>> labWithMostRequests =
				h -> h.getDepartments().stream()
						.flatMap(dep -> dep.getDoctorList().stream())
						.flatMap(doc -> doc.getVisits().stream())
						.flatMap(visit -> visit.getVisitResults().stream())
						.filter(visitResult -> visitResult.getResult() == ResultType.LAB)
						.collect(Collectors.groupingBy(o -> ((Lab) o), Collectors.counting())).entrySet().stream()
						.max((res1, res2) -> res2.getValue().intValue() - res1.getValue().intValue())
						.map(x -> x.getKey().getId());

		// Find List of Doctors with the most med prescription
		BiFunction<Hospital, Long, Long> doctorsWithMostPrescriptions =
				(h, medId) -> h.getDepartments().stream()
					.flatMap(dep -> dep.getDoctorList().stream())
					.filter(
						doc -> doc.getVisits().stream().filter(
							visit -> visit.getVisitResults().stream()
							.filter(visitResult -> visitResult.getResult() == ResultType.MED
									&& ((Med) visitResult).getId() == medId)
							.count() > 0).count() > 0)
						.count();
		BiFunction<Hospital, Long, Long> doctorsWithMostPrescriptions2 =
				(h, medId) -> h.getDepartments().stream()
					.flatMap(dep -> dep.getDoctorList().stream())
					.filter(
						doc -> doc.getVisits().stream()
								.anyMatch(
									visit -> visit.getVisitResults().stream()
									.anyMatch(visitResult -> visitResult.getResult() == ResultType.MED
											&& ((Med) visitResult).getId() == medId)))
						.count();


		// Reusable code - Find All students who passed the grades
		Function<School, List<Student>> listStudentsWhoGotAorB = (s) ->
				s.getTeachers().stream()
						.flatMap(teacher -> teacher.getGrades().stream())
						.filter(grade -> grade.getGradeLetter() == GradeLetter.A || grade.getGradeLetter() == GradeLetter.B)
						.map(Grade::getStudent)
						.distinct().collect(Collectors.toList());

		// Find all students with at least a given score point
		BiFunction<School, Long, List<Student>> studentWithEnoughScore = (s, minScore) ->
				listStudentsWhoGotAorB.apply(s).stream()
						.filter(student -> (Integer) student.getGrades().stream()
								.mapToInt(o -> o.getCourse().getCreditPoint()).sum() >= minScore)
						.collect(Collectors.toList());

		// Find top K students from the graduating students
		TriFunction<School, Long, Long, List<Student>> getTopKStudents = (s, minScore, k) ->
				studentWithEnoughScore.apply(s, minScore).stream()
						.sorted((o1, o2) -> o2.getGrades().stream()
							.mapToInt(o -> o.getCourse().getCreditPoint()).sum() - o1.getGrades().stream() // Ascending sort
							.mapToInt(o -> o.getCourse().getCreditPoint()).sum())
						.limit(k)
						.collect(Collectors.toList());

		// Edgar's solution
		BiFunction<School, Long, List<Student>> studentListWhoDidMinimumScoreOf = (s, minScore) ->
				s.getTeachers().stream()
						.flatMap(teacher -> teacher.getGrades().stream())
						.map(Grade::getStudent)
						.distinct()
						.filter(
								student -> (Integer) student.getGrades().stream().filter(
										grade -> grade.getGradeLetter() == GradeLetter.A || grade.getGradeLetter() == GradeLetter.B
								).mapToInt(o -> o.getCourse().getCreditPoint()).sum() >= minScore
						)
						.collect(Collectors.toList());

		// Get the Worst course
		Function<School, Optional<Course>> worstCourse = s ->
				s.getTeachers().stream()
					.flatMap(teacher -> teacher.getGrades().stream())
					.filter(grade -> grade.getGradeLetter() != GradeLetter.A && grade.getGradeLetter() != GradeLetter.B)
					.map(Grade::getStudent)
					.sorted((o1, o2) -> o1.getGrades().stream()
							.mapToInt(o -> o.getCourse().getCreditPoint()).sum() - o2.getGrades().stream() // Descending sort
							.mapToInt(o -> o.getCourse().getCreditPoint()).sum())
						.flatMap(student -> student.getGrades().stream()
						.map(Grade::getCourse)).limit(1).findFirst();

		// Teachers solution - on picture

		/**
		 *
		 * Extracting a predicate
		 * Check images,
		 *
		 * Function<Hospital, Optional<Doctor>> mostVisitedDoc=(h)->h.getDepartments().stream().
		 *         flatMap(dep -> dep.getDoctorList().stream())
		 *         .sorted((doc1, doc2)->doc2.getVisitList().size()-doc1.getVisitList().size())
		 *         .findFirst();
		 *
		 * BiFunction<Hospital,Character,Long> doctorsStartingWith=(h,c)->h.getDepartments().stream()
		 *         .flatMap(dep->dep.getDoctorList().stream())
		 *         .filter(doc->doc.getName().startsWith(c.toString()))
		 *         .count();
		 *
		 * TernaryFunction<Hospital, Character, Integer, List<String>> oldestKDoctorWhoseNameStartsWith =
		 *         (h,c,k) ->
		 *                 h.getDepartments().stream().
		 *                         flatMap(dep -> dep.getDoctorList().stream())
		 *                         .filter(doc -> doc.getName().startsWith(c.toString()))
		 *                         .sorted((doc1, doc2) -> doc2.getAge() - doc1.getAge())
		 *                         .limit(k).
		 *                         map(x -> x.getName().toUpperCase())
		 *                         .collect(Collectors.toList());
		 *
		 * Function<Character,List<String>>Top5DoctorsStartingWith=
		 *         (c)->oldestKDoctorWhoseNameStartsWith.apply(Hospital.getInstance(),c,5);
		 *
		 *
		 * BiFunction<Hospital, Patient, Optional<Doctor>> oldestDoctorByPatient = (h, p) ->
		 *         h.getDepartments().stream()
		 *                 .flatMap(dep -> dep.getDoctorList().stream())
		 *                 .filter(doc -> doc.getVisitList().stream().filter(visit -> visit.getPatient().equals(p)).count()>0)
		 *                 .sorted((doc1, doc2) -> doc2.getAge()-doc1.getAge())
		 *                 .findFirst();
		 *
		 *
		 * Function<Hospital, Optional<Long>> mostIssuedLabId = (h) ->
		 *         h.getDepartments().stream()
		 *                 .flatMap(dep -> dep.getDoctorList().stream())
		 *                 .flatMap(doc -> doc.getVisitList().stream())
		 *                 .flatMap(vis -> vis.getResults().stream())
		 *                 .filter(res -> res.getResultType()==ResultType.LAB) // FIX
		 *                 .collect(Collectors.groupingBy(o -> o, Collectors.counting()))
		 *                 .entrySet()
		 *                 .stream()
		 *                 .max((resultT1, resultT2) -> resultT2.getValue().intValue() - (resultT1.getValue().intValue()))
		 *                 .map(x -> ((Lab) x.getKey()).getId());
		 *
		 *
		 *
		 * BiPredicate<Doctor,Long> hasIssued=(doc,medId)->doc.getVisitList().stream()
		 *         .anyMatch(v -> v.getResults().stream().
		 *                 filter(r->r.getResultType()==ResultType.MED)
		 *                 .map(r->(Medication)r)
		 *                 .anyMatch(r -> r.getId() == medId));
		 *
		 * BiFunction<Hospital, Long, Long> countMed =
		 *         (h, medId) -> h.getDepartments().stream()
		 *                 .flatMap(dep -> dep.getDoctorList().stream())
		 *                 .filter(doc -> hasIssued.test(doc,medId))
		 *                 .count();
		 *
		 */
//		BiPredicate<Doctor, Long>





	}
}
