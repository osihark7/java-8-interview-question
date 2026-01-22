package com.java8.question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExtractDuplicates {

	// Extract duplicate elements from an array stream API

	public static void main(String args[]) {

		Integer[] array = { 1, 2, 3, 4, 5, 3, 6, 2, 7, 8, 5, 9, 1 };

		List<Integer> list = Arrays.asList(array);

		Map<Integer, Long> frequencyMap = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Set<Integer> duplicates = frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey).collect(Collectors.toSet());

		duplicates.forEach(System.out::println);
	}
}
