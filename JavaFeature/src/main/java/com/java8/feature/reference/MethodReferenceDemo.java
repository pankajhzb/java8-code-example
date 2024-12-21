package com.java8.feature.reference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("xxx", "yyy", "zzz", "aaa");
        names.forEach(System.out::println);
        String str = "Abh11";
        MyPrinter mp = new MyPrinter();
        mp.print(str, (StringParser::convert));
    }
}
