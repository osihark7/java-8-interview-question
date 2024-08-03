package com.java8.question;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinValues {

	// Find the maximum and minimum of a list of integers


	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(10, 20, 25, 30, 35, 40, 45);
		
		Optional<Integer> max = list.stream().max(Integer :: compareTo);
		
		System.out.println("find out the max value   "+max);
		
		Optional<Integer> min  = list.stream().min(Integer :: compareTo);
		
		System.out.println("Min value of Integer List  "+ min);
		
	}
}
