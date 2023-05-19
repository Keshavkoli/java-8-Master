package com.learnJava.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class PredicateStudentExample2 {
	static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

	static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	static Predicate<Student> p3 = (s) -> s.getGender() == "male";

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

	// Imperative way of coding
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

	public static void main(String[] args) {
		filterStudentByGradeLevel();

		fiterStudentByGpa();

		getByName();

		filterStudents();

		filterStudents2();
	}

}
