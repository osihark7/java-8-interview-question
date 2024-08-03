package com.java8.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseArray {
	
	public static void main(String args[]) {
		
		// Reverse an integer array stream 
		 int[] array = {1, 2, 3, 4, 5};

	        int[] reversedArray = reverseArray(array);
	        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	    }

	    public static int[] reverseArray(int[] array) {
	        List<Integer> reversedList = IntStream.of(array)
	                                              .boxed()
	                                              .collect(Collectors.collectingAndThen(
	                                                  Collectors.toList(),
	                                                  lst -> { Collections.reverse(lst); return lst; }
	                                              ));

	        return reversedList.stream().mapToInt(Integer::intValue).toArray();
	    
		
	}

}
