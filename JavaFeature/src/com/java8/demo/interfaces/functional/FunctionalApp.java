package com.java8.demo.interfaces.functional;

public class FunctionalApp {
    public static void main(String[] args) {

        Converter<Integer, String> converterIntToStr = intFrom -> String.valueOf(intFrom);
        System.out.println("converterIntToStr : " + converterIntToStr.convert(456666));

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println("StrToInt : " + converted);    // 123
    }
}
