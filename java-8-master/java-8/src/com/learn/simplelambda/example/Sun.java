package com.learn.simplelambda.example;

//Java Lambda Expression Example: No Parameter
public class Sun {
	public static void main(String[] args) {
		int lenght = 40;

		Star s = () -> {
			return "STARS ARE VERY FAR FROM PLANET EARTH";
		};
		System.out.println(s.say());
		System.out.println(lenght);

	}
}
