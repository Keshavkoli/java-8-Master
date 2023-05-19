package com.learn.simplelambda.example;

public class Main {
	public static void main(String[] args) {

		Sayable s = (name) -> {
			return "Hello  " + name;
		};

		System.out.println(s.draw("keshav"));

		Sayable s1 = (name) -> {
			return "Hello  " + name;
		};
		System.out.println(s1.draw("Kartik"));

	}
}
