package com.java8.question;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculateAge {
	
	// Calculate the age of a person in years
	
	public static void main(String args[]) {
		 String birthdateString = "1990-08-03";
	        
	        // Parse the birthdate string to a LocalDate object
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        
	        System.out.println(formatter);
	        LocalDate birthdate = LocalDate.parse(birthdateString, formatter);
	        
	        System.out.println(birthdate);
	        
	        // Get the current date
	        LocalDate currentDate = LocalDate.now();
	        
	        System.out.println(currentDate);
	        
	        // Calculate the age
	        int age = Period.between(birthdate, currentDate).getYears();
	        
	        // Print the age
	        System.out.println("Age: " + age + " years");
	}


}
