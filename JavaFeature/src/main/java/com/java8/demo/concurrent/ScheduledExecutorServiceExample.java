package com.java8.demo.concurrent;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        task1();
        //task2();
    }

    private static void task2() throws ExecutionException, InterruptedException {
        // Create a ScheduledExecutorService with 5 threads
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        // Create an anonymous implementation of the Callable interface
        ScheduledFuture scheduledFuture = scheduledExecutorService.schedule((Callable) () -> {
            // Do something
            System.out.println("Executed!");
            String s = "Called!";
            return s;
        }, 1, TimeUnit.SECONDS);

        // Wait for the task to complete
        scheduledFuture.get();

        // Shut down the ScheduledExecutorService
        scheduledExecutorService.shutdown();
    }

    private static void task1() throws InterruptedException {
        AtomicInteger count = new AtomicInteger();
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Runnable task1 = () -> {
            count.getAndIncrement();
            System.out.println("Running...task1 - count : " + count);
        };

        // init Delay = 5, repeat the task every 5 second
        ScheduledFuture<?> scheduledFuture = ses.scheduleAtFixedRate(task1, 5, 5, TimeUnit.SECONDS);

        /*while (true) {
            System.out.println("count :" + count);
            Thread.sleep(1000);
            if (count.get() == 5) {
                System.out.println("Count is 5, cancel the scheduledFuture!");
                scheduledFuture.cancel(true);
                ses.shutdown();
                break;
            }
        }*/

    }

}
