package com.keshav.learn.lambda_25_01_23;

public class ClosuresExample {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;// this is actually final bu the compiler says you don't have to put final keyword example final int b= 20;
		doProcess(a, i -> System.out.println(i + b));
	}

	public static void doProcess(int i, Process p) {
		p.process(i);
	}
}

interface Process {
	void process(int i);
}