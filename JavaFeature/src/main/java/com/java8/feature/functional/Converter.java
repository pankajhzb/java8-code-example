package com.java8.feature.functional;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}