package com.java8.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplesOfFive {
	
	// Print the numbers from a given list of integers that are multiples of 5
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(10,20,30,5,45,67,89);
		
		List<Integer> result = list.stream().filter(n -> n%5==0).collect(Collectors.toList());
		
		System.out.println(result);
	}

}
