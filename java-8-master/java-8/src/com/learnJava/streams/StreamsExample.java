package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		Predicate<Student> gradePredicate = student -> student.getGradeLevel() >= 3;
		Predicate<Student> gpaPredicate = student -> student.getGradeLevel() > 3;
		Predicate<Student> genderPredicate = student -> student.getGender().equals("male");

		List<Student> getgender = StudentDataBase.getAllStudents().stream().filter(genderPredicate).collect(Collectors.toList());

		System.out.println(":getgender: " + getgender);

		System.out.println("----------div----------");

		List<String> names = Arrays.asList("adam", "dan", "jenny");
		names.stream();
		names.parallelStream();
		StudentDataBase.getAllStudents().stream();
		StudentDataBase.getAllStudents().parallelStream();

		Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream(). // .parallelStream don't
																							// forget.
				filter(gpaPredicate) // Stream<Student>
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println("studentMap  : " + studentMap);
		System.out.println("-------------div------------");

		Map<String, Integer> studentMap2 = StudentDataBase.getAllStudents().stream().filter(gradePredicate)
				.collect(Collectors.toMap(Student::getName, Student::getGradeLevel));

		System.out.println("StudentMap2 : " + studentMap2);

		System.out.println("------------div------------");
		List<String> studentActivities = StudentDataBase.getAllStudents().stream() // Stream<Student>
				.map(Student::getActivities) // <Stream<List<Activites>>
				.flatMap(List::stream) // <Stream<String>
				.distinct() // removes duplicates
				.collect(Collectors.toList()); // collects it to a list.

		List<String> namesList = StudentDataBase.getAllStudents().stream() // Stream<Student>
				.peek((student -> {
					System.out.println(student);
				})).map(Student::getName) // <Stream<List<Activites>>
				.peek(System.out::println)
				.distinct() // removes duplicates
				.collect(Collectors.toList()); // collects it to a list.

		System.out.println("namesList  : " + namesList);

	}
}
