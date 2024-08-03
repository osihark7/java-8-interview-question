package com.java8.question;

import java.util.stream.IntStream;

public class FirstTenOddNumbers {

	// Print the first 10 odd numbers

	public static void main(String args[]) {
		
		IntStream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);
	}
}
