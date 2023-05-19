package com.keshav.learn.lambda_25_01_23;

// take input and do different things based on the input
// this is the example of polymorphism

// there are the three ways 
public class Greeter {
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public void book() {
		System.out.println("Harry-potter series");
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.book();
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting lambdagreeting = () -> System.out.println("Hello! WORLD!");
		// the above lambda is behaving like the implementation for the interface
//		greeter.greet(helloWorldGreeting);//Hello world!
//		helloWorldGreeting.perform();//Hello! WORLD!
		lambdagreeting.perform();
		// NOTE- YOU can execute lambda Expression.By calling the interface method on
		// it, just as if it were an instance of a class

		HelloWorld helloworld = () -> System.out.println("got the documents from the college");
		AddFunction add = (int a, int b) -> a + b;
		
		
		//below is the Example of anonymous class inline implementation of an interface
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("morning habits");
			}
		};
		innerClassGreeting.perform();//morning habits
		greeter.greet(lambdagreeting);//Hello! WORLD!
		greeter.greet(innerClassGreeting);//morning habits
		
		
	}

	interface AddFunction {
		public int add(int a, int b);
	}
}
