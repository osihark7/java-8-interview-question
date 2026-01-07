package com.java8.question.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
	        
	        // How do you merge two unsorted arrays into single sorted array using Java 8 streams?
	        
	        int[] a = new int[] {4, 2, 7, 1};
	         
	        int[] b = new int[] {8, 3, 9, 5};
	         
	        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
	         
	        System.out.println(Arrays.toString(c));
	        
	        // How do you merge two unsorted arrays into single sorted array without duplicates?
	        
	        int[] aa = new int[] {4, 2, 5, 1};
	         
	        int[] bb = new int[] {8, 1, 9, 5};
	         
	        int[] cc = IntStream.concat(Arrays.stream(aa), Arrays.stream(bb)).sorted().distinct().toArray();
	         
	        System.out.println(Arrays.toString(cc));
	        
	        //How do you get three maximum numbers and three minimum numbers from the given list of integers?
	        
	        List<Integer> listOfIntegerss = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	         
	        //3 minimum Numbers
	         
	        System.out.println("-----------------");
	         
	        System.out.println("Minimum 3 Numbers");
	         
	        System.out.println("-----------------");
	         
	        listOfIntegerss.stream().sorted().limit(3).forEach(System.out::println);
	         
	        //3 Maximum Numbers
	         
	        System.out.println("-----------------");
	         
	        System.out.println("Maximum 3 Numbers");
	         
	        System.out.println("-----------------");
	         
	        listOfIntegerss.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	    }
}