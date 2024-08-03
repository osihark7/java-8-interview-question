package com.java8.question;

import java.util.Arrays;
import java.util.List;

public class SortStringsByLength {
	
	// Sort a list of strings according to the increasing order of their length
	
	public static void main(String args[]) {

		List<String> strings = Arrays.asList("apple", "banana", "kiwi", "cherry", "fig", "strawberry");

        strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));


        System.out.println("Strings sorted by length: " + strings);
		
		
	}

}
