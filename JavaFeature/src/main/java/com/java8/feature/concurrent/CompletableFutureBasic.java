package com.java8.feature.concurrent;

import java.util.concurrent.CompletableFuture;

//https://youtu.be/9ueIL0SwEWI

/**
 * CompletableFuture will have at most one data and error
 * Stream can have zero, one or more data.
 * Map - Function, to transform the data
 */
public class CompletableFutureBasic {

    public static int compute() {
        System.out.println("Compute: " + Thread.currentThread());
        return 2;
    }

    public static void printInt(int value) {
        System.out.println(value);
        System.out.println("printIt: " + Thread.currentThread());
    }

    public static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(() -> compute());
    }

    public static void main(String[] args) {
        System.out.println("main: " + Thread.currentThread());
        //sleep(1000);
        //exp1
        create()
                .thenAccept(data -> printInt(data))
                .thenRun(() -> System.out.println("all done"))
                .thenRun(() -> System.out.println("not really"))
                .thenRun(() -> System.out.println("keep on going on"));

        // ex2
        create()
                .thenApply(data -> data * 2)
                .thenApply(data -> data + 1)
                .thenAccept(data -> printInt(data));

    }

    private static boolean sleep(int millisec) {
        try {
            Thread.sleep(1000);
            return true;
        } catch (InterruptedException e) {
            return false;
        }

    }
}
