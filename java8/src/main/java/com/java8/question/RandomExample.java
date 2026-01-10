package com.java8.question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;

public class RandomExample {

	//How does the new Random Number Generators API in Java 17 improve upon the previous implementation?
	
	public static void main(String arg[]) {
		 RandomGenerator rng = RandomGeneratorFactory.of("Xoshiro256PlusPlus")
	             .create();
	        int randomInt = rng.nextInt();
	        rng.doubles().limit(5).forEach(System.out::println);


	        RandomGenerator splitRng = RandomGeneratorFactory.of("L64X128MixRandom").create();
	      
           System.out.println(splitRng);
           
           
          // Sort List in Reverse Order
           
           List<String> names = Arrays.asList("John", "Adam", "Zack");
           List<String> sorted = names.stream()
               .sorted(Comparator.reverseOrder())
               .collect(Collectors.toList());
           System.out.println(sorted);
           
           //Count Character Frequency
           String str = "hello";
           Map<Character, Long> freq = str.chars()
               .mapToObj(c -> (char)c)
               .collect(Collectors.groupingBy(
                   c -> c, 
                   Collectors.counting()
               ));
           System.out.println(freq);
	}
}
