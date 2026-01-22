package com.java8.question.java8;

import java.util.Optional;

/*
 * Optional wraps potentially null values to avoid NullPointerExceptions, offering methods like 
 * orElse, ifPresent, and map. It promotes explicit null handling. Example: Optional.ofNullable(value).orElse
 * ("default"); returns default if null
 * 
}*/
public class OptionalClass {
  public static void main(String arg[]) {
	  Optional<String> name = Optional.ofNullable("Java");
	  name.ifPresent(System.out::println);
	  
  }
}
