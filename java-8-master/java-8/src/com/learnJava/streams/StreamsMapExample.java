package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

	private static List<String> namesUpperCase(List<Student> names) {
		List<String> namesUpperCase = names.stream() // Stream<Student>
				.map(Student::getName) // Stream<String>
				.map(String::toUpperCase) // Stream<String> -> UpperCase
				.collect(toList()); // returns List // terminal operation
		return namesUpperCase;
	}

	private static Map<String, Integer> getValues(List<Student> value) {

		Map<String, Integer> values = value.stream().collect(toMap(Student::getName, Student::getNoteBooks));

		return values;
	}

	private static Set<String> namesSetUpperCase(List<Student> students) {
		Set<String> namesUpperCase = students.stream() // Stream<Student>
				.map(Student::getName) // Stream<String>
				.map(String::toUpperCase) // Stream<String> -> UpperCase
				.collect(toSet()); // returns List // terminal operation
		return namesUpperCase;
	}

	private static Map<String, Integer> namesLengthMap(ArrayList<String> names) {

		Map<String, Integer> namesLengthMap = names.stream()// Stream<String>
				.collect(toMap(String::toString, String::length)); // returns Map

		return namesLengthMap;
	}

	public static List<String> getStudent(List<Student> li) {

		List<String> getgender = StudentDataBase.getAllStudents().stream().map(p -> p.getGender())
				.collect(Collectors.toList());

		return getgender;
	}

	public static List<String> getnames(List<Student> list) {
		List<String> name = StudentDataBase.getAllStudents().stream().map(k -> k.getName())
				.collect(Collectors.toList());
		return name;
	}

	public static List<Integer> getStudentgrade(List<Student> list) {
		List<Integer> grade = StudentDataBase.getAllStudents().stream().map(l -> l.getGradeLevel())
				.collect(Collectors.toList());

		return grade;
	}

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("adam");
		names.add("dan");
		names.add("jenny");

		System.out.println("namesUpperCase List : " + namesUpperCase(StudentDataBase.getAllStudents()));
		System.out.println("namesUpperCase Set : " + namesSetUpperCase(StudentDataBase.getAllStudents()));
		System.out.println("namesLengthMap : " + namesLengthMap(names));
		System.out.println("get the list of gender  :" + getStudent(StudentDataBase.getAllStudents()));
		System.out.println("get the list of names : " + getnames(StudentDataBase.getAllStudents()));
		System.out.println("Get the student grade level :  " + getStudentgrade(StudentDataBase.getAllStudents()));

		// Example of Map
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream().map(n -> n * 2).forEach(System.out::println);
		System.out.println("-------------div------------");

		List citylist = Arrays.asList("delhi", "mumbai", "hyderabad", "ahmedabad", "indore", "patna").stream()
				.map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(citylist);

		System.out.println(getValues(StudentDataBase.getAllStudents()));

	}

}
