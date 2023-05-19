package com.learnJava.streams;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class StreamFlatMapExample {

//	flatMap() = Flattening (flat)+ mapping (map)  
//	It performs flattening (flat or flatten) and mapping (map), simultaneously. The Stream.flatMap() method combines both the operations i.e. flat and map.
//	Flattening is the process of converting several lists of lists and merge all those lists to create a single list containing all the elements from all the lists.

//	Before Flattening: [[1, 2, 3, 4], [7, 8, 9, 0], [5, 6], [12, 18, 19, 20, 17], [22]]
//	After Flattening: [1, 2, 3, 4, 7, 8, 9, 0, 5, 6, 12, 18, 19, 20, 17, 22]

	public static List<String> printStudentActivities() {

		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities) // Stream<List<String>>
				.flatMap(List::stream) // <Stream<String>
				.distinct()// with distinct keyword we cannot have duplicate values
				.collect(toList());

		return studentActivities;

	}

	public static List<String> printUniqueStudentActivities() {

		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted().collect(toList());

		return studentActivities;

	}

	public static List<String> getStudentActivites() {
		List<String> country = Stream
				.of(Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius"),
						Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe",
								"Greece", "Iceland"))
				.distinct().flatMap(List::stream).collect(Collectors.toList());
		return country;
	}

	public static long getStudentActivitiesCount() {

		long totalActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List::stream).distinct().count();

		return totalActivities;

	}

	public static void main(String[] args) {

		System.out.println("Student Activities : " + printStudentActivities());
		System.out.println("Unique Student Activities : " + printUniqueStudentActivities());
		System.out.println("Unique Student Activities Count: " + getStudentActivitiesCount());
		System.out.println("list of country into one unit  : " + getStudentActivites());

	}

}
