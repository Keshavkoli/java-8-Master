package com.learn.simplelambda.example;

public class Main3 {
	public static void main(String[] args) {

		Sayable2 s = (message) -> {
			String str = "Hello world  ";

			String str2 = str + message;

			return str2;
		};
		System.out.println(s.message("Precise"));
	}
}
