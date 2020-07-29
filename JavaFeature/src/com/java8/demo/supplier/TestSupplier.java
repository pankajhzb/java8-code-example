package com.java8.demo.supplier;

import com.java8.demo.model.Person;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestSupplier {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> {
            return new Person("Varun", 30, "Programmer");
        };
        Person p = supplier.get();
        System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge() + ", " + p.getAddress());


        int[] fibs = {0, 1};
        Stream<Integer> fibonacci = Stream.generate(() -> {
            int result = fibs[1];
            int fib3 = fibs[0] + fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = fib3;
            return result;
        });

        System.out.println("fib result : " + fibonacci.toArray().toString());
    }

    //IntSupplier intSupplier = () - > 4;




}
