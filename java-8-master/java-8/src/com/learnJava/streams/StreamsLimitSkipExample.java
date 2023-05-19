package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integers) {
		return integers.stream().limit(2)
				// it will process only 2 elements //6
				// 7
				.reduce((a, b) -> a + b);
	}

	public static Optional<Integer> skip(List<Integer> integers) {
		return integers.stream().skip(3)// the first 3 elements will skip //9,10
				.reduce((a, b) -> a + b);
	}

	public static void main(String[] args) {

		List<Integer> integer = Arrays.asList(1, 2); // the
		Optional<Integer> limit = limit(integer);
		if (limit.isPresent()) {
			System.out.println("The limit result is : ==>" + limit.get());
		} else {
			System.out.println("No Input is passed");
		}

		List<Integer> integers = Arrays.asList(6, 7, 8, 9, 10);
		Optional<Integer> limitResult = limit(integers);
		int result = limitResult.isPresent() ? limitResult.get() : 0;
		System.out.println("The limit result is : " + result);

		Optional<Integer> skipResult = skip(integers);
		int result1 = skipResult.isPresent() ? skipResult.get() : 0;
		System.out.println("The skip result is : " + result1);
	}
}
