package com.java8.demo.foreach;

import java.util.*;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        // Set
        Set<String> set = new HashSet<String>();
        set.add("abc");
        set.add("abd");
        set.add("dbc");
        set.add("ebc");
        set.add("abe");
        // Hash map
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("1", "India");
        hashMap.put("2", "Singapore");
        hashMap.put("3", "Australia");
        hashMap.put("4", "Zeneva");
        // List
        List<Integer> integerList = Arrays.asList(1, 2, 4, 5, 6, 7, 6, 8);
        // Find the equal pair of integer from the list.
        integerList.forEach(i -> check(i));


        /*Consumer cons = new Consumer<Integer>(){
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };*/
        /* Consumer cons = (integer) -> System.out.println(integer);*/
        /*Consumer cons = integer -> System.out.println(integer);*/

        /*integerList.forEach(integer -> System.out.println(integer));*/
        integerList.forEach(System.out::println); // method reference

        //Please note that we can pass a static method in forEach() statement
        // if we want to have multiple statements to handle the list value.
        integerList.stream().forEach(i -> integerList.forEach(j -> checkValue(i, j)));

        // Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer>> modify = list ->
        {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        modify.accept(integerList);
        System.out.println(" after modify :----");
        integerList.forEach(System.out::println);


        integerList.forEach(integer -> {
                    if (integer.compareTo(4) > 0) {
                        System.out.println("FOUR");
                    }
                }
        );


        hashMap.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

        set.forEach(System.out::println);

    }

    private static Integer checkValue(Integer i, Integer j) {
        if (i == j)
            return i;
        return i;
    }

    private static void check(Integer integer) {

        Objects.requireNonNull(integer); // since java 1.7

    }
}
