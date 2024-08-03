package com.java8.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	// Remove duplicate elements from a list using Java 8 streams

	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 ,1,2,3,4,7);
		
		List<Integer> duplicate = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("::::::After Remove Duplicate::::" + duplicate);

	}

}
