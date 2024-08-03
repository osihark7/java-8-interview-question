package com.java8.question;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacters {

	// Print duplicate characters in a string stream api

	public static void main(String args[]) {

		String input = "helloindia";

		Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Set<Character> duplicates = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toSet());

		duplicates.forEach(System.out::println);

	}

}
