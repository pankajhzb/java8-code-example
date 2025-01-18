package com.practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PlayWithMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("vivek", 100);
        map.put("Rinku", 400);
        map.put("vishal", 600);
        map.put("shankar", 500);
        map.put("shyam", 500);
        map.put("tinku", 300);
        System.out.println("Nth Salary: " + findNthSalary(map, 2));

        System.out.println(moveZerosToEnd(Arrays.asList(0, 1, 0, 3, 12)));
        sortMapValue();
        duplicate();

        String str = "pankajbeena";
        duplicateElementOccurrence(str);
        duplicateCharacter(str);
    }

    public static List<Integer> moveZerosToEnd(List<Integer> nums) {
        List<Integer> zeros = nums.stream().filter(x -> x == 0).collect(Collectors.toList());
        List<Integer> numbers = nums.stream().filter(x -> x != 0).collect(Collectors.toList());
        numbers.addAll(zeros);
        return numbers;
    }

    public static void sortMapValue() {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 280);
        map.put("banana", 80);
        map.put("guava", 60);
        map.put("orange", 180);
        map.put("pomegranate", 289);
        System.out.println("1. " + map.values().stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()));
        System.out.println("2. " + map.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(3).collect(Collectors.toList()));
    }

    //Q. How to find duplicate elements in a given integers list in java using Stream functions?

    public static void duplicate() {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        // Removed duplicates
        System.out.println("Distinct values...");
        myList.stream().distinct().forEach(System.out::println);

        List<Map.Entry<Integer, Long>> duplicateList = new ArrayList<>(myList.stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()).stream().filter(e -> e.getValue() > 1).collect(Collectors.toList());
        System.out.println("Duplicate values...");
        duplicateList.stream().map(Map.Entry::getKey).forEach(System.out::println);
    }

    public static Integer findNthSalary(Map<String, Integer> map, int nth) {
        return map.values().stream().sorted(Comparator.reverseOrder()).limit(nth).min(Comparator.comparing(Function.identity())).get();
    }

    //Question 1 : Write a program to find the duplicate characters in list of string . Only java stream will be accepted ?

    public static void duplicateCharacter(String str) {
        //Example: String str = "pankajbeena";
        //p a n k a j b e e n a
        // p-1, a-3
        System.out.println("Duplicate Character: " + Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(ch -> ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(ch -> ch.getValue() > 1).map(Map.Entry::getKey)
                .collect(Collectors.toList()));
    }

    // Question 2 : Find the duplicate element and its occurrence in a given string ?
    public static void duplicateElementOccurrence(String str) {
        System.out.println("DuplicateElementOccurrence: " +
                Arrays.stream(str.split("")).collect(Collectors
                                .groupingBy(ch -> ch,
                                        LinkedHashMap::new, Collectors.counting()))
                        .entrySet().stream().filter(c -> c.getValue() > 1)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
    }
}
