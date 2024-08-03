package com.java8.question;

import java.util.Arrays;

public class SumAndAverageWithStreams {
	
	//  Find the sum and average of all elements in an integer array
	
	public static void main(String args[]) {
		
		int[] list = {1,2,3,4,5,6,8,9};
		
		int data = Arrays.stream(list).sum();
		
		System.out.println(":::::Sum of the Integer List     "+data);
		
		
	     double average = Arrays.stream(list).average().orElse(0);
	     
	     
	 	System.out.println("Avarage of the Integer list of aaray     :  "  + average);
		
		
		
		
	}

}
