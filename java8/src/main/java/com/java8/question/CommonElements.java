package com.java8.question;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElements {
	
	// Find the common element between two array
	
	public static void main(String args[]) {
		
	  int[] array1   =  {1,2,3,4,5,6};
	  int[] array2   =  {3,6,3,4,5,6};
	  
	  
	 Set<Integer>  commonElement = findCommonElement(array1, array2);
	 
	  System.out.println(commonElement);
	        
	}

	private static Set<Integer> findCommonElement(int[] array1, int[] array2) {
		 
		Set<Integer> data = Arrays.stream(array1).boxed().collect(Collectors.toSet());
		Set<Integer> data1 = Arrays.stream(array2).boxed().collect(Collectors.toSet());
		
		data.retainAll(data1);
		
		return data;
				
				
	}



}
