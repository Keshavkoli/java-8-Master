package com.keshav.learn.lambda_25_01_23;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseSolutioninJava7 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("lewis", "Calloral", 42),
				new Person("Thomas", "Carly", 51), new Person("Charlett", "Bronote", 45),
				new Person("Matheew", "Arnold", 39));

		// step 1 : sort list by last name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});

		// step2 : create a method that prints all elements in the list
		System.out.println("Printing all people");
		printAll(people);

		// step 3: create a method that prints all the people that have last name
		// beginning with C
//		printLastNameBeginningwithC(people);
		System.out.println("Printing people LastName starting with c");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		System.out.println("Printing people getFirstName starting with c");
		printConditionally(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("C");
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (p.getLastName().startsWith("C")) {
				System.out.println(p);
			}
			if (condition.test(p)) {
				System.out.println(p);
			}
		}

	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
}

interface Condition {
	boolean test(Person p);
}
