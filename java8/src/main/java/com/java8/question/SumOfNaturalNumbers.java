package com.java8.question;

import java.util.stream.IntStream;

public class SumOfNaturalNumbers {
	
	// Find the sum of the first 10 natural numbers  in java 8 stream
	
	public static void main(String args[]) {
		
		int sum = IntStream.rangeClosed(1, 10).sum();
		
        System.out.println("Sum of the first 10 natural numbers: " + sum);
		
	}

}
