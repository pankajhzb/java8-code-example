package com.java8.demo.functional;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}