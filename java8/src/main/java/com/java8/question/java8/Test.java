package com.java8.question.java8;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		FunctionalInterfaceDemo g = () -> System.out.println("Hello, Java!");
		g.sayHello();
		
		// Find the duplicate character 
		
		String str = "helloIndia";
		
		Map<Character, Long> duplicate = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(duplicate);
	}
}
