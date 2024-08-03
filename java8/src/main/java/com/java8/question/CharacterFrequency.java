package com.java8.question;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

	// Find the frequency of each character in a string using Java 8 streams

	public static void main(String args[]) {
		String str = "Hello India Good Morning";

		Map<Character, Long> freequency = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// System.out.println(freequency);

		freequency.forEach((character, frequency) -> System.out.println(character + ": " + frequency));
		
		
		 Integer[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

	        Map<Integer, Long> frequencyMap = Arrays.stream(array)
	            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        frequencyMap.forEach((element, frequency) -> 
	            System.out.println(element + ": " + frequency));
	}

}
