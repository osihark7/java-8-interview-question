package com.java8.question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStartingWithNumber {
	
	//   Find strings in a list that start with a number java 8
	
	public static void main(String args[]) {
		
		List<String> str = Arrays.asList("Apple", "0Banana", "Lichi", "Aap", "Radhe");
		
		  List<String> stringsStartingWithNumber = str.stream()
	                .filter(s -> Character.isDigit(s.charAt(0)))
	                .collect(Collectors.toList());
		  

		  stringsStartingWithNumber.forEach(System.out::println);
		
		
	}

}
