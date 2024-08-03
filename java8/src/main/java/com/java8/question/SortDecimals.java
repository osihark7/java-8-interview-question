package com.java8.question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortDecimals {
	
	//  Sort a given list of decimals in reverse order
	public static void main(String args[]) {
		
		List<Double> decimal  = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.5, 7.5);
		
		List<Double>  reverse = decimal.stream().sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("Before Reverse  :: "+ decimal);
		
		System.out.println("After Reverse the decimal list  ::: "+reverse);
	}

}
