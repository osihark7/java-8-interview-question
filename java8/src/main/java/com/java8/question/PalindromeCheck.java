package com.java8.question;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeCheck {
	
	// Check if a string is a palindrome using Java 8 streams
	
	 public static void main(String[] args) {
	        String input = "madam";
	        boolean isPalindrome = isPalindrome(input);
	        System.out.println("Is the string \"" + input + "\" a palindrome? " + isPalindrome);
	    }

	    public static boolean isPalindrome(String input) {
	        String reversed = IntStream.rangeClosed(1, input.length())
	                                   .mapToObj(i -> input.charAt(input.length() - i))
	                                   .map(Object::toString)
	                                   .collect(Collectors.joining());

	        return input.equals(reversed);
	    }

}
