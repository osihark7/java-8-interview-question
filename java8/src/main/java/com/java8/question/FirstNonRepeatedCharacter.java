package com.java8.question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	// Find the first non-repeated character in a string

	public static void main(String args[]) {

		String input = "helloindiailoveyou";

		Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Character firstNonRepeated = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() == 1)
				.map(Map.Entry::getKey).findFirst().orElse(null);

		if (firstNonRepeated != null) {
			System.out.println("First non-repeated character: " + firstNonRepeated);
		} else {
			System.out.println("No non-repeated characters found.");
		}

	}

}
