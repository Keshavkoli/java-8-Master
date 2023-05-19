package com.keshav.learn.lambda_25_01_23;

//Note - the @FunctionalInterface annotation is completely optional.
//the java compiler does not require it for your lambda types. but it is good practice to add it.
@FunctionalInterface
public interface Greeting {
	public void perform();

}
