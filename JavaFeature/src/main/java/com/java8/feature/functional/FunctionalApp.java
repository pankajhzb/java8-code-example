package com.java8.feature.functional;

import java.util.function.Function;

public class FunctionalApp {
    public static void main(String[] args) {
        //Function interface apply()

        Function<Integer, Integer> intToDouble = i->i*i;
        Converter<Integer, String> converterIntToStr = String::valueOf;
        Converter<String, Integer> converterStrToInt = Integer::valueOf;

        System.out.println("intToDouble : " + intToDouble.apply(2));
        System.out.println("IntToStr : " + converterIntToStr.convert(456666));
        System.out.println("StrToInt : " + converterStrToInt.convert("123"));
    }
}
