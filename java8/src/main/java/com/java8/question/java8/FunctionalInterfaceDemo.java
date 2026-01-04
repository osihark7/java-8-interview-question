package com.java8.question.java8;


/*
Functional Interfaces : A Functional Interface is an interface that has exactly one abstract method.
They are the foundation of Lambda Expressions and Stream API (Java 8+).
*
*✔ Can have default methods
✔ Can have static methods
❌ Cannot have more than one abstract method

2️⃣ Why Functional Interfaces?

Enable Lambda Expressions

Support functional programming

Reduce boilerplate code

Widely used in Streams, Collections, Concurrency


9️⃣ Interview Tricky Points 🔥

Can a functional interface have default methods? ✔ Yes

Can it have static methods? ✔ Yes

Can it extend another interface? ✔ Yes (if abstract method count = 1)

Is Runnable a functional interface? ✔ Yes

Is Comparator functional? ✔ Yes
*/
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	void sayHello();
	
}
