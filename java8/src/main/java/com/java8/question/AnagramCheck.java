package com.java8.question;

public class AnagramCheck {

	// Check if two strings are anagrams or not using Java 8 streams

	// Anagrams -
	// Convert both strings to lowercase to ensure the comparison is
	// case-insensitive.
	// Remove any non-letter characters (if necessary).
	// Sort the characters of both strings.
	// Compare the sorted character arrays. test

	public static void main(String args[]) {

		String str1 = "silent";

		String str2 = "listen";

		boolean arAnagram = checkAnagram(str1, str2);

		System.out.println(arAnagram);
	}

	private static boolean checkAnagram(String str1, String str2) {

		String sortedStr1 = str1.chars().mapToObj(c -> (char) c).sorted()
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

		String sortedStr2 = str2.chars().mapToObj(c -> (char) c).sorted()
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();

		return sortedStr1.equals(sortedStr2);
	}

}
