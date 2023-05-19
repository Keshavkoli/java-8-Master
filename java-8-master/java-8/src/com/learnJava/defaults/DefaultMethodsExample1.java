package com.learnJava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample1 {

    public static void main(String[] args) {

    	//java 7
        List<String> stringList  = Arrays.asList("Adam", "Jenny", "Alex","Eric","Mike");

        Collections.sort(stringList);

        System.out.println("Sorted list : " +  stringList);
       
        //java 8
        
        stringList.sort(Comparator.naturalOrder());
        
        System.out.println("stringList size : "+stringList.size());
        
        System.out.println("stringList isEmpty() : "+stringList.isEmpty());
        
        System.out.println("stringList contains() : "+stringList.contains("Adam"));
        
        System.out.println("Sorted list : " +  stringList);

        stringList.sort(Comparator.reverseOrder());

        System.out.println("Reverse Sorted list : " +  stringList);

    }
}
