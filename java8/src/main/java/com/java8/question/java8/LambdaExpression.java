package com.java8.question.java8;


/*ava lambda expressions, introduced in Java 8, allow developers to write concise,
 *  functional-style code by representing anonymous functions. They enable passing 
 *  code as parameters or assigning it to variables, resulting in cleaner and more 
 *  readable programs.
Lambda expressions implement a functional interface (An interface with only one 
abstract function) Enable passing code as data (method arguments).
Allow defining behavior without creating separate classes.
 * 
 * Syntax: (params) -> expression or (params) -> { statements; }
 * */
interface Add {

	int addition(int a, int b);
}

public class LambdaExpression {
	public static void main(String[] args) {
		Add add = (a, b) -> a + b;
		int result = add.addition(10, 20);
		System.out.println("Sum: " + result);
	}
}
