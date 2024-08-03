package com.java8.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxAndMin {
	
	// Get the three maximum and three minimum numbers from a given list of integers
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(2, 46,81,2,3,4,5,6,7,8,9);
		
		System.out.println("Get Three Max Number ");
		
		// short list and remove duplicate
		List<Integer> shortData = list.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println(shortData);
		
		// find minimum 3 value
		
		List<Integer> minimum = shortData.stream().limit(3).collect(Collectors.toList());
		
		System.out.println(minimum);
		
		// Find 3 maximum number from list
		
		List<Integer> maximum = shortData.stream().skip(shortData.size()-3).collect(Collectors.toList());
		
		System.out.println(maximum);
	
		
	}

}
