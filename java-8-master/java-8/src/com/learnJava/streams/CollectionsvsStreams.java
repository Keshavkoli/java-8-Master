package com.learnJava.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsvsStreams {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Adam");
		names.add("Jim");
		names.add("Jenny");
		System.out.println(names);
		System.out.println(names);

		System.out.println("------div------");

		Stream<String> namesStream = names.stream();

		namesStream.forEach(System.out::println);
//		namesStream.forEach(System.out::println); we cannot print streams twice it will give error
	}
}
