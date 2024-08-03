package com.java8.question;

import java.util.Arrays;

public class LastElement {
	
	// Get the last element of the array
	
	public static void main(String args[]) {
		
		Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		   Integer lastElement = Arrays.stream(array)
	                .reduce((first, second) -> second)
	                .orElse(null);

	        // Print the last element
	        if (lastElement != null) {
	            System.out.println("Last element: " + lastElement);
	        } else {
	            System.out.println("Array is empty.");
	        }
		
	}

}
