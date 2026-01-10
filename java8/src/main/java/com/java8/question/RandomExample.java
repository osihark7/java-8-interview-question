package com.java8.question;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomExample {

	//How does the new Random Number Generators API in Java 17 improve upon the previous implementation?
	
	public static void main(String arg[]) {
		 RandomGenerator rng = RandomGeneratorFactory.of("Xoshiro256PlusPlus")
	             .create();
	        int randomInt = rng.nextInt();
	        rng.doubles().limit(5).forEach(System.out::println);


	        RandomGenerator splitRng = RandomGeneratorFactory.of("L64X128MixRandom").create();
	      
           System.out.println(splitRng);
           
           //hello
	}
}
