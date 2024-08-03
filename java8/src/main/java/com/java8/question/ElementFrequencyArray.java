package com.java8.question;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElementFrequencyArray {
	
	// Find the frequency of each element in an array or a list
	
	public static void main(String args[]) {
		
		Integer[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4};
		
		 Map<Integer, Long> frequencyMap = Arrays.stream(arr)
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 
		 System.out.println(frequencyMap);
		 
	}

}
