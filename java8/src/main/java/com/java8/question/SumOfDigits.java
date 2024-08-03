package com.java8.question;

public class SumOfDigits {
	
	//  Find the sum of all digits of a number in Java 8
	
	public static void main(String args[]) {
		
		int number = 265892;
		
		int sum = sumOfAllNumber(number);
		
		System.out.println(sum);
		
	}

	private static int sumOfAllNumber(int number) {
		
		return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
	}

}
