package com.learnJava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	public static Optional<String> ofNullable() {

		return Optional.ofNullable("Hello");

	}

	public static Optional<String> ofNullable1() {
		return Optional.ofNullable(null);
	}

	public static Optional<String> of() {

		return Optional.of("Hello");
//		 return Optional.of(null);

	}

	public static Optional<String> empty() {

		return Optional.empty();
		// return Optional.of(null);

	}

	public static void main(String[] args) {

		System.out.println("Optional ofNullable() Method : " + ofNullable().get());
		System.out.println("Optional ofNullable() Method : " + ofNullable().isPresent());// if value present true if not
																							// false
		System.out.println("Optional ofNullable1 : " + ofNullable1());
		System.out.println("Optional of of() Method : " + of());
		System.out.println("Optional of Empty() method  : " + empty());
	}
}
