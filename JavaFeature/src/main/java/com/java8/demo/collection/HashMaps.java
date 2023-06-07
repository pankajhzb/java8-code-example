package com.java8.demo.collection;

import java.util.*;
import java.util.Map.Entry;

public class HashMaps {

    static HashMap<Integer, String> map = null;
    private static int[] toSort;
    private static int[] sortedInts;
    private static int[] sortedRangeInts;

    public static void main(String[] args) {
        initVariables();
        givenIntArray_whenUsingParallelSort_thenArraySorted();
    }

    public static void initVariables() {
        toSort = new int[]{5, 1, 89, 255, 7, 88, 200, 123, 66};
        sortedInts = new int[]{1, 5, 7, 66, 88, 89, 123, 200, 255};
        sortedRangeInts = new int[]{5, 1, 89, 7, 88, 200, 255, 123, 66};

        map = new HashMap<>();
        map.put(55, "John");
        map.put(22, "Apple");
        map.put(66, "Earl");
        map.put(77, "Pearl");
        map.put(12, "George");
        map.put(6, "Rocky");
    }

    // @Test
    public static void givenIntArray_whenUsingParallelSort_thenArraySorted() {
        Arrays.parallelSort(toSort);

        for (int i : toSort) {
            System.out.println("parallelsorted: " + i);
        }

        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Entry<Integer, String>>() {

            @Override
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        entries.stream().forEach(System.out::println);
    }

}
