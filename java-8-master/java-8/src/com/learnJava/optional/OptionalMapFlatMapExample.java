package com.learnJava.optional;

import com.learnJava.data.Bike;
import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

	// flatMap()
	public static void optionalFlatMap() {

		/*
		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());//Optional<Student> 

		Optional<String> name = studentOptional.filter(student -> student.getGpa() >= 3.5).flatMap(Student::getBike)//returns ->Optional<Bike>
				.map(Bike::getName);

		System.out.println("name   : " + name);

		name.ifPresent(s -> System.out.println("name : " + s));
		*/

		
		  Optional<Student> studentOptional = StudentDataBase.getOptionalStudent(); 
		  if(studentOptional.isPresent()) 
		  {
			  Optional<Bike> bikeOptional = studentOptional.flatMap(Student::getBike); //
			  System.out.println("bikeOptional : " + bikeOptional); }
		 
	}

	// map()
	public static void optionalMap() {

		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

		if (studentOptional.isPresent()) {
			Optional<String> stringOptinal = studentOptional.filter(student -> student.getGpa() >= 3.5)
					.map(Student::getName);
			System.out.println("stringOptinal : " + stringOptinal.get());
		}

		/*
		 * Optional<Student> studentOptional = StudentDataBase.getOptionalStudent();
		 * 
		 * if (studentOptional.isPresent()) { Optional<String> nameOptional =
		 * studentOptional.map(Student::getName); //
		 * System.out.println("nameOptional : " + nameOptional); }
		 */
	}

	// filter()
	public static void optionalFilter() {

//		Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
//
//		System.out.println("studentOptional  : " + studentOptional);
//		studentOptional.filter(student -> student.getGpa() >= 4.0).ifPresent(student -> System.out.println(student));

		Optional<Student> studentOptional = StudentDataBase.getOptionalStudent()
				.filter(student -> student.getGpa() >= 4.3);

		// the filter() gives the flixiblty to apply the filter operations on object

		studentOptional.ifPresent(student -> System.out.println(student));

	}

	public static void main(String[] args) {
		optionalFlatMap();
		optionalMap();
		optionalFilter();
	}
}
