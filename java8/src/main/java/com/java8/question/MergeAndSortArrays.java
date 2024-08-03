package com.java8.question;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeAndSortArrays {
	
	// Merge two unsorted arrays into a single sorted array using Java 8 streams
	
	public static void main(String args[]) {
		

	        int[] array1 = {5, 3, 9, 1};
	        int[] array2 = {8, 2, 6, 4};

	        int[] mergedSortedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
	            .sorted()
	            .toArray(); 

	        System.out.println("Merged and sorted array: " + Arrays.toString(mergedSortedArray));
	}

}
