package com.java.string.joiner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Java 8 Collectors.joining() :
//There are three forms of Collectors.joining() method available. They are,
//a) Collectors.joining()
//b) Collectors.joining(CharSequence delimiter)
//c) Collectors.joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)

public class StringJoinerCollectionExample {
	public static void main(String[] args) {
//		Collectors.joining() Example : Joining list of strings without delimiter

		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinedString = listOfStrings.stream().collect(Collectors.joining());
		System.out.println(joinedString);
		System.out.println("----------------div--------------");

//		Collectors.joining() Example : Joining list of strings with delimiter

		List<String> listOfStrings2 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinedString2 = listOfStrings2.stream().collect(Collectors.joining(" | "));
		System.out.println(joinedString2);
		System.out.println("----------------div--------------");
		
		
//		Collectors.joining() Example : Joining list of strings with delimiter, prefix and suffix
		
		List<String> listOfStrings3 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String joinedString3 = listOfStrings3.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(joinedString3);
	}

}
