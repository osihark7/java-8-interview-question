package com.java8.question.java8;

import java.util.Arrays;
import java.util.List;

/*
 * forEach iterates over collections or streams, accepting lambdas or method references for actions on 
 * each element. Added to Iterable and Map. Example: list.forEach(System.out::println); prints each item
 * 
 * */
public class ForEachMethod {
	public static void main(String arg[]) {

		List<String> list = Arrays.asList("Java", "Spring", "AWS");

		list.forEach(item -> System.out.println(item));

	}
}
