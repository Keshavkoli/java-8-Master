package com.java.string.joiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Java8StringJoinerExample {
	public static void main(String[] args) {

		// StringJoiner is a class imported from java.util.StringJoiner;
//		StringJoiner class internally uses StringBuilder class to join the strings. It is placed in java.util package. 
//		Using Java 8 StringJoiner, you can join only the strings, but not the array of strings or list of strings.

		// There are two ways to construct StringJoiner objects. They are
		// a) StringJoiner(CharSequence delimiter)
		// b) StringJoiner(CharSequence delimiter, CharSequence prefix, CharSequence
		// suffix)

		StringJoiner sj = new StringJoiner("|");
		sj.add("Facebook");
		sj.add("Twitter");
		sj.add("YouTube");
		sj.add("WhatsApp");
		sj.add("LinkedIn");
		System.out.println(sj);
		// output = Facebook|Twitter|YouTube|WhatsApp|LinkedIn

		System.out.println("----------------div--------------");

		StringJoiner sj2 = new StringJoiner(", ", "[", "]");
		sj2.add("Facebook");
		sj2.add("Twitter");
		sj2.add("YouTube");
		sj2.add("WhatsApp");
		sj2.add("LinkedIn");
		System.out.println(sj2);
		System.out.println("----------------div--------------");
//        output = [Facebook, Twitter, YouTube, WhatsApp, LinkedIn]

		
//		example of String.join() Method Example : Joining the strings
		
		String joinedString = String.join(" | ", "Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		System.out.println(joinedString);
		System.out.println("----------------div--------------");
		
//		String.join() Method Example : Joining an array of strings
		
		String[] strArray = new String[] { "Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn" };
		String joinedString2 = String.join(" | ", strArray);
		System.out.println(joinedString2);
		System.out.println("----------------div--------------");
		
//		String.join() Method Example : Joining list of strings
		
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString3 = String.join(" | ", listOfStrings);
        System.out.println(joinedString3);
	}
}
