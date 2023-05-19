package com.learnJava.streams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamsOfGenerateIterateExample {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("adam", "dan", "jenny", "dave");
		stringStream.forEach(System.out::println);

		Stream.iterate(1, x -> x * 2).limit(10).forEach(System.out::println);

		List<Integer> integerList = Stream.iterate(1, x -> x * 2)// the iterate() method it will work like (1,x-> x*2) =
																	// 1*2=2,2*2=4,4*2=8 and so on
				.limit(10)// it will take only the first 10 values
				.map(Integer::new).collect(toList());

		System.out.println("iterate : " + integerList);

		Supplier<Integer> supplier = new Random()::nextInt;// gives some random values with nectInt method

		List<Integer> integerList1 = Stream.generate(supplier).limit(10).collect(toList());
		System.out.println("generate : " + integerList1);

	}
}
