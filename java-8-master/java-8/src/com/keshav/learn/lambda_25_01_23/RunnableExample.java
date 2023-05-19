package com.keshav.learn.lambda_25_01_23;

// classic example of Anonymous class 
//Note - this works because Runnable has Single Method. if it had more then one method you could not have written a lambda function of that type
public class RunnableExample {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}

		});
		myThread.run();// Printed inside Runnable

		Thread MythreadLambda = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		MythreadLambda.run();// Printed inside Lambda Runnable

	}
}
