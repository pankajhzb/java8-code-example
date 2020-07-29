package com.java8.demo.interfaces.functional;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}