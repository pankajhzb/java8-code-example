package com.java8.feature.consumer;

import java.util.function.BiConsumer;

public class BiConsumerImpl implements BiConsumer<String, String> {
    @Override
    public void accept(String s, String s2) {
        if (s.contains("1")) {
            System.out.println("ONE");
            // where is hashmap impl
        }

    }
}
