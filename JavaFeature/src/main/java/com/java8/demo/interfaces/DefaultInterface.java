package com.java8.demo.interfaces;

public interface DefaultInterface {
    default void calculate(int i, int j) {
        System.out.println("Calculated : " + (i + j));
    }
}
