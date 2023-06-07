package com.java8.demo.reference;

public class StringParser {
    public static String convert(String s) {
        if (s.length() <= 3) {
            s = s.toUpperCase();
        } else {
            s = s.toLowerCase();
        }
        return s;
    }
}
