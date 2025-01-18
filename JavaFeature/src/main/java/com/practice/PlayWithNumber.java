package com.practice;

import java.util.Arrays;
import java.util.Comparator;

public class PlayWithNumber {
    //Question 9 : Write a program to find second-highest element from an array ,
    // Array can contain duplicate elements
    // . Solve it by stream java 8.
    static int[] array = {1, 3, 2, 4, 5, 6, 6, 9, 9, 10, 11};

    public static void main(String[] args) {
        System.out.println(Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
