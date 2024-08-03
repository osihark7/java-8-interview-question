package com.java8.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddEven {
	
	// Separate odd and even numbers in a list of integers
	
	public static void main(String args[]) {
		
		List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
		
		
		List<Integer> evenNumber = list.stream().filter(n ->n%2==0).collect(Collectors.toList());
		
		List<Integer> oddNumber = list.stream().filter(n ->n%2!=0).collect(Collectors.toList());
		
		System.out.println("Even Number " + evenNumber);
		System.out.println("Odd Number  " + oddNumber);
		
	}

}
