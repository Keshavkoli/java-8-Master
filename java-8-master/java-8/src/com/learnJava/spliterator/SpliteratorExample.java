package com.learnJava.spliterator;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.stream.Stream;

/*spliterator():This method is added into java.lang.Iterable interface from Java 8
as a default method.So,it is available in all the classes and subinterfaces which
implement or extend this interface.It is used to get Spliterator over the elements of
arrays or collections or streams.*/

public class SpliteratorExample {
	public static void main(String[] args) {
		int size;
		// create a Scanner class object to take input from the user
		Scanner sc = new Scanner(System.in);
		// Create an array list for doubles.
		ArrayList<Integer> ages;
		System.out.println("Enter size of the ArrayList:");
		size = sc.nextInt();
		ages = new ArrayList<Integer>(size);
		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " Age:");
			int data = sc.nextInt();
			ages.add(data);
		}
		// close Scanner class object
//		sc.close();
		// use the stream() method to obtain a Stream to the array list.
		Stream<Integer> stream1 = ages.stream();
		// use spliterator() method to get the Spliterator object on ages
		Spliterator<Integer> spliterator1 = stream1.spliterator();
	}
}
