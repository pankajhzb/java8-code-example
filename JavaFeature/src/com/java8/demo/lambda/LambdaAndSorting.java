package com.java8.demo.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaAndSorting {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        // old
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        // using lambda
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        // even more shorter
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        // even more more sorter
        Collections.sort(names, (a, b) -> b.compareTo(a));
        // method as reference - ?
        names.forEach(System.out ::println);
    }
}
