package com.java8.question.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Stream API is used to process collections of objects. A stream in Java is a sequence 
 * of objects that supports various methods that can be pipelined to  *  produce the desired result. 
 * 
 * Use of Stream in Java
The uses of Stream in Java are mentioned below:

Stream API is a way to express and process collections of objects.
Enable us to perform operations like filtering, mapping, reducing and sorting.

 * Syntax
Stream<T> stream;
 * */
public class StreamAPI {
	
	public static void main(String arg[]) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Traditional
		List<Integer> evens = new ArrayList<>();
		for(int n : numbers) {
		    if(n % 2 == 0) evens.add(n);
		}
      System.out.println(evens);
		// Stream API
		List<Integer> evenss = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		 System.out.println(evenss);
	}

}
