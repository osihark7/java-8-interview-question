package com.java8.question.java8;

import java.util.List;
import java.util.stream.Collectors;

/*Method Reference : 
 * Method Reference is a shorthand notation of a lambda expression that calls an existing method.
   Introduced in Java 8, it makes code cleaner and more readable.
*
*
*   Why Method References?
Reduce boilerplate code
Improve readability
Work with Functional Interfaces
Widely used in Stream API

Interview Questions 🔥

Can method references replace all lambdas? ❌ No
Do method references work without functional interfaces? ❌ No
Which functional interface does System.out::println use? ✔ Consumer
Is constructor reference a method reference? ✔ Yes

Method Reference is a shorthand way to refer to a method using :: and is used with functional
 interfaces to make code more readable.
*/
public class MethodReferences {

	public static void main(String arg[]) {
		// Reference to an Instance Method of an Arbitrary Object
		List<String> names = List.of("Ravi", "Amit", "Suresh");
		names.stream().map(String::toUpperCase).forEach(System.out::println);
		List<String> result = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(result);
		// Method Reference with Stream API
		List<Integer> numbers = List.of(1, 2, 3, 4);
		numbers.stream().map(Math::sqrt).forEach(System.out::println);
	}

}
