package com.java8.question;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedElement {
	
	//  Find the most repeated element in an array
	
	public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        int mostRepeated = findMostRepeatedElement(array);
        System.out.println("Most repeated element: " + mostRepeated);
    }

    public static int findMostRepeatedElement(int[] array) {
        return Arrays.stream(array)
                     .boxed()
                     .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                     .entrySet()
                     .stream()
                     .max(Map.Entry.comparingByValue())
                     .map(Map.Entry::getKey)
                     .orElseThrow(() -> new RuntimeException("Array is empty"));
    }

}
