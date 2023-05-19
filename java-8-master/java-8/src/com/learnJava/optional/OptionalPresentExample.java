package com.learnJava.optional;

import java.util.Optional;

public class OptionalPresentExample {
// covered the method of isPresent() and the ifPresent()
	public static void main(String[] args) {

		Optional<String> stringOptional = Optional.ofNullable("Hello Optional");

		// isPresent() has no argument
		System.out.println(stringOptional.isPresent());// isPresent -> (true) checks has some value or not

		// ifPresent() has argument to perform
		stringOptional.ifPresent((s -> System.out.println("value is : " + s)));// ifPresent
	}
}
