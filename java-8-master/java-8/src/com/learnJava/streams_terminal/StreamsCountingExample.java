package com.learnJava.streams_terminal;

import com.learnJava.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

	public static long count() {
		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9)//it counts the number of values 
				//we can provide conditions with filter() method
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {

		System.out.println(count());
	}
}
