package com.java8.demo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraysApp {
    static List<Integer> ar = Arrays.asList(1, 2, 3, 4, 5);
    static List<Integer> ar1 = Arrays.asList(1, 2, 3, 4, 5);
    static List<Integer> ar2 = Arrays.asList(1, 6, 5, 2, 8);

    public static void main(String[] args) {
        int value = simpleArraySum(ar);
        System.out.println("value: " + value);
        List<Integer> list = compareTriplets(ar1, ar2);

        ar.stream().filter(e->e%2==0).collect(Collectors.toMap(Integer::intValue, Function.identity()));

    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        return ar.stream().mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>();
       //a.forEach(x -> x.compareTo(b.forEach(y -> y);));
        //a.stream().mapToInt( a -> a.compareTo(b.stream().mapToInt(Integer::intValue));
        return list;
    }

}
