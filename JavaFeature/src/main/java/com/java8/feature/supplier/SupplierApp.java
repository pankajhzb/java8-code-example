package com.java8.feature.supplier;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Varun", 30, "Programmer");
        Person p = supplier.get();
        System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge() + ", " + p.getAddress());

        int[] fibs = {0, 1};
        Stream<Integer> fibonacci = Stream.generate(() -> {
            int result = 0;
            while (result < 20) {
                result = fibs[1];
                int fib3 = fibs[0] + fibs[1];
                fibs[0] = fibs[1];
                fibs[1] = fib3;
            }
            return result;
        });

        System.out.println("fib result : " + Arrays.toString(fibonacci.toArray()));
    }

    // IntSupplier intSupplier = () - > 4;

}
