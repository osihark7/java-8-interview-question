package com.java8.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {
	
	// Join a list of strings with '[' as prefix, ']' as suffix, and ',' as delimiter
	
	public static void main(String args[]) {
		
		List<String> str = Arrays.asList("Apple", "Banana", "Delhi");
		
		String result  = str.stream()
	            .collect(Collectors.joining(",", "[", "]"));
		
		System.out.println(result);
		
		
	}

}
