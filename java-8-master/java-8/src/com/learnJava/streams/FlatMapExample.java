package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
//	this class combines multiple lines into single unit 
	public static void main(String[] args) {
		// creating ArrayList
		List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
		List<String> productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");
		List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
		List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");

		// adding elements to the list
		List<List<String>> allproducts = new ArrayList<List<String>>();
		allproducts.add(productlist1);
		allproducts.add(productlist2);
		allproducts.add(productlist3);
		allproducts.add(productlist4);

		List<String> listOfAllProducts = new ArrayList<String>();

		for (List<String> pro : allproducts) {
			for (String product : pro) {
				// adds all products to the list
				listOfAllProducts.add(product);
			}
		}
		System.out.println("List Before Applying mapping and Flattening: \n");
		// prints stream before applying the flatMap() method
		System.out.println(listOfAllProducts);

		List<String> flatMapList = allproducts.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
		System.out.println("List After Applying Mapping and Flattening Operation: \n");
		System.out.println(flatMapList);

	}

}
