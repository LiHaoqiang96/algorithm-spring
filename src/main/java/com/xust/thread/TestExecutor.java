package com.xust.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutor {
    public static void sleep(int mills) {
        try {
            Thread.sleep(mills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testExecutor() {
        ExecutorService service = Executors.newSingleThreadExecutor();
//        ExecutorService service = Executors.newFixedThreadPool(2);

        service.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    sleep(1000);
                    System.out.println("Execute1 " + i);
                }
            }
        });

        service.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; ++i) {
                    sleep(1000);
                    System.out.println("Execute2 " + i);
                }
            }
        });

        service.shutdown();
        while (!service.isTerminated()) {
            sleep(1000);
            System.out.println("Wait for termination.");
        }
    }

    public static void main(String[] args) {
        testExecutor();
    }
}
