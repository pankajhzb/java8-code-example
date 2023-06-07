package com.java8.demo.stream;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamApp {
    static int[] numbers = {4, 1, 13, 90, 16, 2, 0, 4};

    public static void main(String[] args) {

        // copy
        int[] copy = Arrays.copyOf(numbers, numbers.length); // avoid mutating the original array
        // sort
        Arrays.sort(copy);
        // pick first 3
        Set<Integer> hs = new LinkedHashSet<Integer>(); // maintain order and no duplicate ie distinct
        for (int i : copy) { // Oops, forget to get only distinct.
            hs.add(i); // loose the order
        }
        System.out.println("Before java 8___________");
        hs.forEach(System.out::println);

        // using stream
        System.out.println("Using STREAM___________");
        IntStream.of(numbers) // Create the stream
                .distinct() // process
                .sorted() // process
                .limit(3) // process
                .forEach(System.out::println); // Consume the stream

        // ex 2, ways to creat estream
        IntStream.of(numbers);
        IntStream.range(1, 101); // 1...100
        IntStream.rangeClosed(1, 1000); // 1...100
        IntStream.generate(supplier()); // from supplier

        // ex 3
        IntStream.of(numbers).filter(num -> num % 2 == 0); // only even
        IntStream.of(numbers).map(num -> num * 2);
        IntStream.of(numbers).boxed(); // convert each number into Integer
        IntStream.of(numbers).anyMatch(num -> num % 2 == 1); // is any number odd
        IntStream.of(numbers).allMatch(num -> num % 2 == 1); // are all number odd
        // ex 4
        IntStream.of(numbers).boxed().collect(Collectors.toSet()).forEach(System.out::println);

    }

    private static IntSupplier supplier() {
        return null;
    }
}
