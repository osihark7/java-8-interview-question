package com.java8.question;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArray {
	
	// Merge two unsorted arrays into a single sorted array using Java 8 streams
	
	public static void main(String args[]) {
		
		 int[]  array1 = {1,2,3,4,5,6};
		
		 int[]  array2 = {1,2,3,4,5,6};
		
		   int[] mergedSortedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
		            .sorted()
		            .toArray();
		   
	        System.out.println("Merged and sorted array: " + Arrays.toString(mergedSortedArray));

	}

}
