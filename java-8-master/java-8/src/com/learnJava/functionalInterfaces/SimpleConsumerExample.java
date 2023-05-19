package com.learnJava.functionalInterfaces;

import java.util.function.Consumer;

public class SimpleConsumerExample {
	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("java 8");

		Consumer<String> c2 = (s1) -> System.out.println(s1.toUpperCase());
		c2.accept("keshav");

		Consumer<String> c3 = (s2) -> System.out.println(s2.toUpperCase());
		c3.accept("Kartik");
	}
}
