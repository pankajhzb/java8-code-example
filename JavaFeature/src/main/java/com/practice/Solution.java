package com.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {

        //System.out.println(moveZerosToEnd(Arrays.asList(0, 1, 0, 3, 12)));
        //sortMapValue();
        duplicate();
    }

    public static List<Integer> moveZerosToEnd(List<Integer> nums) {
        List<Integer> zeros = nums.stream().filter(x -> x == 0).collect(Collectors.toList());
        List<Integer> numbers = nums.stream().filter(x -> x != 0).collect(Collectors.toList());
        numbers.addAll(zeros);
        return numbers;
    }

    public static void sortMapValue() {
        Map map = new HashMap<>();
        map.put("apple", 280);
        map.put("banana", 80);
        map.put("guava", 60);
        map.put("orange", 180);
        map.put("pomegranate", 289);

        System.out.println(map.values().stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()));
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(3).collect(Collectors.toList());
    }

    //Q. How to find duplicate elements in a given integers list in java using Stream functions?

    public static void duplicate() {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        // Removed duplicates
        System.out.println("Distinct values...");
        myList.stream().distinct().forEach(System.out::print);

        List<Map.Entry<Integer, Long>> duplicateList = new ArrayList<>(myList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet());
        System.out.println("Distinct keys...");
        duplicateList.stream().map(Map.Entry::getKey).forEach(System.out::print);

        // java.util.Set<Map.Entry<Integer, Integer>> entrySet = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //List<Integer> duplicateList  =  entrySet.stream().map(e -> e.getValue() > 1).collect(Collectors.toList());
    }
}
