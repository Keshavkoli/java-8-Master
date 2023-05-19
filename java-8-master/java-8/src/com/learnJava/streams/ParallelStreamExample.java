package com.learnJava.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamExample {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		
		//Normal Execution
        
		names.stream().filter((String name) -> name.length() > 5).skip(1).forEach(System.out::println);
		// used the skip() to skip the index value example = 0,1,2,3... etc
		
		//Parallel Execution
        
		names.parallelStream().filter((String name) -> name.length() < 5).forEach(System.out::println);

	}
}
