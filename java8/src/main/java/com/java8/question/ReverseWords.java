package com.java8.question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
	
	
	// Reverse each word in using java 8 stream
	
	public static void main(String args[]) {
		
		String str = "Hello India i love you ";  

		String result = reverseString(str);
		
		
		System.out.println("::::::::  "  +  result);
		
		
		
	}

	private static String reverseString(String str) {
		
		return Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));
	}

}
