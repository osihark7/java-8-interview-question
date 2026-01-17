package com.java8.question;

import java.util.stream.IntStream;

public class FirstTenOddNumbers {

	public static void main(String args[]) {

		// Print the first 10 odd numbers

		IntStream.iterate(1, n -> n + 2).limit(10).forEach(System.out::println);

		// Print the first 10 even numbers

		IntStream.iterate(2, n -> n + 2).limit(10).forEach(System.out::println);

	}

}
