package com.learnJava.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> upperCase = (name) -> name.toUpperCase();

	static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");

	static Function<String, Integer> strLength = (name) -> name.length();

	public static void main(String[] args) {

		System.out.println("Result is : " + upperCase.apply("java8"));

		System.out.println("Result of andthen : " + upperCase.andThen(addSomeString).apply("java8"));
		// andThen() method executes the function in the order it is mentioned

		System.out.println("Result of compose : " + upperCase.compose(addSomeString).apply("java8"));
		// compose() method is something that executes the first parameter function that
		// has being passed to the compose and
		// then it executes the outer function

		Function<String, String> abc = Function.identity();

		System.out.println(abc.apply("ABC"));

	}
}
/*
 * #Difference between andThen and compose method in java
 * 
 * While compose applies the function passed in the argument first and then the
 * function on which it's invoked, andThen does the same in reverse.
 * 
 */