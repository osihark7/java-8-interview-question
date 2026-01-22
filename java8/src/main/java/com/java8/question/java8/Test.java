package com.java8.question.java8;

public class Test {
	public static void main(String[] args) {
		FunctionalInterfaceDemo g = () -> System.out.println("Hello, Java!");
		g.sayHello();
	}
}
