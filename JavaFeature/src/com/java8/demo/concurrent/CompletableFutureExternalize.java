package com.java8.demo.concurrent;

import java.util.concurrent.CompletableFuture;

//https://youtu.be/9ueIL0SwEWI

/**
 * CompletableFuture will have at most one data and error
 * Stream can have zero, one or more data.
 * Map - Function, to transform the data
 */
public class CompletableFutureExternalize {

    // creating completable future pipeline
    private static void process(CompletableFuture<Integer> future) {
        future.thenApply(data -> data * 2)
                .thenApply(data -> data + 1)
                .thenAccept(System.out::println);

    }

    public static void main(String[] args) {
        CompletableFuture<Integer> future = new CompletableFuture<>();
        process(future); // calling pipeline here
        future.complete(2);
    }
}
