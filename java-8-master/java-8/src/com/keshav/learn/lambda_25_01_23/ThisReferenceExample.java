package com.keshav.learn.lambda_25_01_23;

// note this reference is unmodified when you are using it inside lambda expression
public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is " + i);
				System.out.println(this);
			}

			public String toString() {
				return "This is anonoymous inner class";
			}

		});
		thisReferenceExample.doProcess(10, i -> {
			System.out.println("value of i is " + i);
			//System.out.println(this);  this reference is unmodified when you are using it inside lambda expression
		});

	}
}
