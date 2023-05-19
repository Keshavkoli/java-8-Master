package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvgExample {

	public static int sum() {

		int totalNoOfNotebooks = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.summingInt(Student::getNoteBooks));// the summingInt() gets the total sum of
																		// notebook of each and every student in the
																		// Studentdatabase

		return totalNoOfNotebooks;
	}

	public static double average() {

		double totalNoOfNotebooks = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.averagingInt(Student::getNoteBooks));// the averagingInt() gets  the average 

		return totalNoOfNotebooks;
	}

	public static void main(String[] args) {

		System.out.println("Total no of Notebooks : " + sum());

		System.out.println("Average no of Notebooks : " + average());
	}
}
