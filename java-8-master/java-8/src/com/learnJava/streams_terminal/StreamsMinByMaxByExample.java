package com.learnJava.streams_terminal;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamsMinByMaxByExample {

	public static Optional<Student> minBy() {

		Optional<Student> studentOptional = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));// the minBy() print the least gpa
																					// from the studentdatabase in the
																					// List

		return studentOptional;
	}

	public static Optional<Student> maxBy() {

		Optional<Student> studentOptional = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));// the maxBy() print the Greatest gpa
		// from the studentdatabase in the
		// List

		return studentOptional;
	}

	public static List<Student> maxByMultipleStudents() {

		List<Student> maxStudents = new ArrayList<>();
		Optional<Student> studentOptional = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));

		Student maxStudent = studentOptional.isPresent() ? studentOptional.get() : null;
		if (maxStudent != null) {

			maxStudents = StudentDataBase.getAllStudents().stream()
					.filter(student -> maxStudent.getGpa() == student.getGpa()).collect(toList());

			System.out.println("Max Students are : " + maxStudents);
		}
		return maxStudents;
	}

	public static void main(String[] args) {

		System.out.println(minBy());

		System.out.println(maxBy());

		System.out.println(maxByMultipleStudents());
	}
}
