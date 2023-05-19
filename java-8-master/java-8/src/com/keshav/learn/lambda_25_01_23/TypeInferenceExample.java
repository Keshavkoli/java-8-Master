package com.keshav.learn.lambda_25_01_23;

// three ways we can write the lambdas
public class TypeInferenceExample {
	public static void main(String[] args) {
//		StringLenghtLambda StringLenght = (String s) -> s.length();
//		StringLenghtLambda StringLenght = (s) -> s.length();// here without the return type
		StringLenghtLambda StringLenght = s -> s.length();// here without the return type and paranthesis
		System.out.println(StringLenght.getLength("Hello World!"));
	}

	public static void printlambda(StringLenghtLambda l) {
		System.out.println(l.getLength("Hello World!"));
	}

	interface StringLenghtLambda {
		int getLength(String s);
	}
}
