package com.java8.question.java8;

interface Vehicles {
    default void start() {
        System.out.println("Vehicle started");
    }
}