package com.java8.question.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		
		FunctionalInterfaceDemo g = () -> System.out.println("Hello, Java!");
		g.sayHello();
		
		// Find the duplicate character 
		
		String str = "helloIndia";
		
		Map<Character, Long> duplicate = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(duplicate);
		
		// Find secondHighest Number
		
		List<Integer> number = Arrays.asList(1,2,3,4);
		
		int secondLage = number.stream().distinct().sorted((a,b)-> b.compareTo(a)).skip(1).findFirst().orElse(-1);
		System.out.println(secondLage);
		
		// Merge two array
		
		int[]  array1 = {1,2,3,4,5,6};
		int[]  array2 = {7,8,9,10,11,12};
		
		int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).sorted().toArray();
		
		System.out.println(Arrays.toString(mergedArray));
		
		
		
		
		
	}
}
