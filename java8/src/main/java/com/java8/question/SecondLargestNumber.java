package com.java8.question;

import java.util.Arrays;

public class SecondLargestNumber {
	
	// Find the second largest number in integer
	
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		int secondLargest = Arrays.stream(arr).boxed().distinct()
				.sorted((a,b)->b.compareTo(a)).skip(1).findFirst().orElse(-1);
		
		System.out.println(secondLargest);
	}
	

}
