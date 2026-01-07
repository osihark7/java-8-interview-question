package com.java8.question.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
	        
	        //Find sum of all digits of a number in Java 8?
	        
	        int i = 15623;
	         
	        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
	         
	        System.out.println(sumOfDigits);
	        
	        //Given a list of strings, sort them according to increasing order of their length? 
	        
	        List<String> listOfString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
	         
	        listOfString.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	        
	        // Given an integer array, find sum and average of all elements?
	        int[] number = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
	         
	        int sum = Arrays.stream(number).sum();
	         
	        System.out.println("Sum = "+sum);
	         
	        double average = Arrays.stream(number).average().getAsDouble();
	         
	        System.out.println("Average = "+average);
	        
	        // How do you find common elements between two arrays?
	        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
	         
	        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
	         
	        list1.stream().filter(list2::contains).forEach(System.out::println);
	        
	        // How do you find sum of first 10 natural numbers?
	        
	        int numsum = IntStream.range(1, 11).sum();
	         
	        System.out.println(numsum);
	    }
}