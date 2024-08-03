package com.java8.question;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

	// Find the first repeated character in a string

	public static void main(String args[]) {

		String input = "programming";

		Set<Character> seenCharacters = new HashSet<>();

		Character firstRepeated = input.chars().mapToObj(c -> (char) c).filter(c -> !seenCharacters.add(c)).findFirst()
				.orElse(null);

		System.out.println(firstRepeated);
	}

}
