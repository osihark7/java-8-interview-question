package com.java8.question;

import java.util.stream.Stream;

public class FibonacciSeries {
	
	// Find the FibonacciSeries using java stream API
	
	public static void main(String args[]) {
		
		 Stream.iterate(new long[]{0, 1}, f -> new long[]{f[1], f[0] + f[1]})
         .limit(10) 
         .map(f -> f[0])
         .forEach(System.out::println);
		
	}

}
