package com.learnJava.lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {

	static int k = 5;// if we declare a static variable we can reassign the value other wise not
						// possible

	public static void main(String[] args) {

		int i = 4; // if we make the value static we can reassign the value
		// Repeated variable name not allowed
		// we cannot modify any local variable that is being referenced in the lambda
		// scope
		// Consumer<Integer> c1 = (i) -> {
		Consumer<Integer> c1 = (a) -> {
			// int i=0;
			System.out.println(i * 2);
		};

		c1.accept(i);

		Consumer<Integer> c2 = (b) -> {
			k = 10;
			System.out.println(k * 2);
		};
		c2.accept(k);
	}
}
