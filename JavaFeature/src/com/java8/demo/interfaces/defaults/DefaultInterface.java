package com.java8.demo.interfaces.defaults;

public interface DefaultInterface {
    default void calculate(int i, int j) {
        System.out.println("Calculated : " + (i + j));
    }
}
