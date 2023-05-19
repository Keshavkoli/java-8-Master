package com.learn.simplelambda.example;

public class Main2 {
	public static void main(String[] args) {

		Added ad1 = (a, b) -> (a + b);
		System.out.println(ad1.add(10, 10));

		Added ad2 = (int a, int b) -> (a * b);
		System.out.println(ad2.add(20, 20));
	}
}
