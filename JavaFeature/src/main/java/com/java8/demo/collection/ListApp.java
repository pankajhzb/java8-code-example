package com.java8.demo.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListApp {

    public static void main(String[] args) {
        givenListContainsNulls_whenFilteringSerial_thenCorrect();
    }

    public static void givenListContainsNulls_whenFilteringSerial_thenCorrect() {
        List<Integer> list = Arrays.asList(null, 1, 2, null, 3, null);
        List<Integer> listWithoutNulls = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        listWithoutNulls.forEach(System.out::println);
    }

}
