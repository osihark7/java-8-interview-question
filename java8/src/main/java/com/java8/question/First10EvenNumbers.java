package com.java8.question;

import java.util.stream.IntStream;

public class First10EvenNumbers {
	
	public static void main(String args[]) {
		
		//  Print the first 10 even numbers
		
	IntStream.iterate(2, n -> n + 2)   
         .limit(10)             
         .forEach(System.out::println);
	
	
		
		
	}

}
