package com.keshav.learn.lambda_25_01_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcersiceSolutioninJava_7 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("lewis", "Carroll", 42),
				new Person("Thomas", "Carly", 51), new Person("Charlett", "Bronte", 45),
				new Person("Matheew", "Arnold", 39));

		// step 1 : sort list by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// step2 : create a method that prints all elements in the list
		printAll(people);

		// step 3: create a method that prints all the people that have last name
		// beginning with C
		printPeopleWithLastNameStartingWithC(people);
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
		System.out.println("-------------div-----------");
	}

	public static void printPeopleWithLastNameStartingWithC(List<Person> people) {
		people.stream().filter(person -> person.getLastName().startsWith("C"))
				.forEach(person -> System.out.println(person));
	}
}
