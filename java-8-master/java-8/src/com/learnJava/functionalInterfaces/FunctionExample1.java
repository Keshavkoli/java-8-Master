package com.learnJava.functionalInterfaces;

public class FunctionExample1 {

	public static String performConcat(String input) {

		return FunctionExample.addSomeString.apply(input);
	}

	public static void main(String[] args) {

		String result = performConcat("hello");
		System.out.println("result :" + result);
	}

}
