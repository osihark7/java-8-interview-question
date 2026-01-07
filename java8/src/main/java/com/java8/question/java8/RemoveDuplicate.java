package com.java8.question.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	
	public static void main(String arg[]) {
		
		 List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
         
	        List<String> uniqueStrngs = listOfStrings.stream().distinct().collect(Collectors.toList());
	         
	        System.out.println(uniqueStrngs);
	        
	        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	         
	        listOfIntegers.stream().filter(i -> i % 5 == 0).forEach(System.out::println);
	        
	        
	        //Given a list of integers, find maximum and minimum of those numbers?
	        
	        List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	         
	        int max = listOfInteger.stream().max(Comparator.naturalOrder()).get();
	         
	        System.out.println("Maximum Element : "+max);
	         
	        int min = listOfInteger.stream().min(Comparator.naturalOrder()).get();
	         
	        System.out.println("Minimum Element : "+min);
	    
	}

}
