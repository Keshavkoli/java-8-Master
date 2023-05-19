package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateStudentExample {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	static Predicate<Student> p3 = (s) -> s.getGender() == "male";

	static Function<Integer, Predicate<Integer>> gradePredicate = (toCompare) -> (number) -> number > toCompare;
	static Function<Double, Predicate<Double>> gpaPredicate = (toCompare) -> (number) -> number > toCompare;

	// Imperative way of coding

	public static void filterStudentByGradeLevel() {
		List<Student> studentlist = StudentDataBase.getAllStudents();
		studentlist.forEach(student -> {
			if (p1.test(student)) {
				System.out.println(student);
			}
		});

	}

	// Imperative way of coding
	public static void fiterStudentByGpa() {
		List<Student> studentgpa = StudentDataBase.getAllStudents();

		studentgpa.forEach(gpa -> {
			if (p2.test(gpa)) {
				System.out.println(gpa);
			}
		});
	}

	// Imperative way of coding
	public static void getByName() {
		List<Student> gender = StudentDataBase.getAllStudents();
		gender.forEach(n -> {
			if (p3.test(n)) {
				System.out.println(n);
			}
		});
	}

	// Imperative way of coding
	public static void filterStudents() {
		System.out.println("filter students");
		List<Student> filterstudents = StudentDataBase.getAllStudents();

		filterstudents.forEach(student -> {
			if (p1.and(p3).test(student)) {
				System.out.println(student);
			}

		});
	}

	public static void filterStudents2() {
		System.out.println("Filter Students Method 2");

		List<Student> filterStudents2 = StudentDataBase.getAllStudents();

		filterStudents2.forEach(student -> {
			if (p1.and(p2).negate().test(student)) {
				System.out.println(student);
			} else {
				System.out.println(student);
			}
		});
	}

	// Declarative way of coding
	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.stream().filter(PredicateStudentExample.p1).collect(Collectors.toList());

		studentList.forEach((student -> {
			if (p1.test(student)) {
//				System.out.println(student);
			}
		}));

		boolean result = gradePredicate.apply(2).test(5) && gpaPredicate.apply(3.6).test(3.9);
		System.out.println("Result from Predicate : " + result);
	}
}
