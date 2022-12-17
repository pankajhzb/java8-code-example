package com.java8.demo.lambda;

@FunctionalInterface
interface Cab { // When exactly 1 abstract method available
    void bookCab();
}

class UberX implements Cab {
    @Override
    public void bookCab() {
        System.out.println("UberX booked arraving soon!!!");
    }
}

public class LambdaApp {
    public static void main(String[] args) {
        // 1. polymorphic statement
        Cab cab = new UberX();
        cab.bookCab();

        // 2. Annonymous class
        Cab cab1 = new Cab() {
            @Override
            public void bookCab() {
                System.out.println("UberX booked arraving soon!!!");
            }
        };
        cab1.bookCab();

        // 3.
        Cab cab2 = () -> {
            System.out.println("UberX booked arraving soon!!!");
        };
        cab2.bookCab();
    }

}
