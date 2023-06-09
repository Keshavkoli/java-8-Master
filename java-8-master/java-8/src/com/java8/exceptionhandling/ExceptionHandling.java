package com.java8.exceptionhandling;

import java.util.function.BiConsumer;
// it is an example of moving try catch to another lambda 
public class ExceptionHandling {
	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4 };
		int key = 0;

		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (Exception e) {
				System.out.println("printed");
			}

		};
	}

}
