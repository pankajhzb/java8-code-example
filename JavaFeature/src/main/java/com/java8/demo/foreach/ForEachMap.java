package com.java8.demo.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // way 1
        map.forEach((k, v) -> {
            if (k.contains("A")) {
                System.out.println("Key : Capital A.");
            }
        });

        // Entry set
        map.entrySet().forEach(System.out::println);

        // custom action
        Consumer<Map.Entry<String, Integer>> action = entry ->
        {
            System.out.println("Key is : " + entry.getKey());
            System.out.println("Value is : " + entry.getValue());
        };

        map.entrySet().forEach(action);

        // 2. Map Key
        Consumer<String> action1 = key ->
        {
            System.out.println("Key is : " + key);
        };

        map.keySet().forEach(action1);

        //3. Map values
        Consumer<Integer> actionOnValues = System.out::println;

        map.values().forEach(actionOnValues);

    }
}
